package com.crud.democrud.services;

import com.crud.democrud.models.UsuarioModel;
import com.crud.democrud.models.UsuarioRolModel;
import com.crud.democrud.repositories.UsuarioRolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioRolService {
    @Autowired
    UsuarioRolRepository usuarioRolRepository;

    public ArrayList<UsuarioRolModel> obtenerRolUsuarios(){
        return (ArrayList<UsuarioRolModel>) usuarioRolRepository.findAll();
    }

    public UsuarioRolModel guardarRolUsuario(UsuarioRolModel rolUsuario){
        return usuarioRolRepository.save(rolUsuario);
    }

    public Optional<UsuarioRolModel> obtenerPorId(Long id){
        return usuarioRolRepository.findById(id);
    }

    public UsuarioRolModel actualizarRolUsuario(UsuarioRolModel rolUsuario){
        return usuarioRolRepository.save(rolUsuario);
    }

    public boolean eliminarRolUsuario(Long id) {
        try{
            usuarioRolRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }



}