package com.crud.democrud.controllers;

import com.crud.democrud.models.UsuarioRolModel;
import com.crud.democrud.services.UsuarioRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/usuarioRol")
public class UsuarioRolController {
    @Autowired
    UsuarioRolService usuarioRolService;

    @GetMapping()
    public ArrayList<UsuarioRolModel> obtenerUsuarios() {
        return usuarioRolService.obtenerRolUsuarios();
    }

    @PostMapping()
    public UsuarioRolModel guardarUsuario(@RequestBody UsuarioRolModel rolUsuario) {
        return this.usuarioRolService.guardarRolUsuario(rolUsuario);
    }

    @GetMapping(path = "/{id}")
    public Optional<UsuarioRolModel> obtenerUsuarioPorId(@PathVariable("id") Long id) {
        return this.usuarioRolService.obtenerPorId(id);
    }


    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id) {
        boolean ok = this.usuarioRolService.eliminarRolUsuario(id);
        if (ok) {
            return "Se eliminó el rol de usuario con id " + id;
        } else {
            return "No pudo eliminar el rol de usuario con id" + id;
        }
    }

    @PutMapping(path = "/{id}")
    public UsuarioRolModel actualizarUsuario(@RequestBody UsuarioRolModel rolUsuario) {
        return this.usuarioRolService.actualizarRolUsuario(rolUsuario);
    }


}