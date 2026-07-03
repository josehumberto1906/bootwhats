package br.com.bootwhats.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import br.com.bootwhats.model.Usuario;
import br.com.bootwhats.repository.UsuarioRepository;

@Controller
public class HomeController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/cadastro")
    public String cadastro() {
        return "cadastro";
    }

    @GetMapping("/listar")
    public String listar(Model model){
        model.addAttribute("usuarios", usuarioRepository.findAll());

        return "listar";
    }

    @PostMapping("/salvar")
    public String salvar(Usuario usuario) {

        usuarioRepository.save(usuario);

        return "redirect:/listar";
    }
    @PostMapping("/atualizar")
    public String atualizar(Usuario usuario) {

        usuarioRepository.save(usuario);

        return "redirect:/listar";
}

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Long id) {

        usuarioRepository.deleteById(id);

        return "redirect:/listar";
}
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {

        Usuario usuario = usuarioRepository.findById(id).orElse(null);

        model.addAttribute("usuario", usuario);

        return "editar";
}

    /*@GetMapping("/lista")
    public String lista(Model model) {

        model.addAttribute("usuarios", usuarioRepository.findAll());

        return "lista";
    }*/
}