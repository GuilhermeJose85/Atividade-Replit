package Controller;

import Model.Usuario;

public class UsuarioController {
    public void cadastrarUsuario(String nome, String email) {
        Usuario usuario = new Usuario(nome, email);
        System.out.println("Usuário cadastrado com sucesso: " + usuario.getNome());
    }

    public void mostrarUsuario(Usuario usuario) {
        System.out.println("Usuário: " + usuario.getNome() + " | Email: " + usuario.getEmail());
    }
}
