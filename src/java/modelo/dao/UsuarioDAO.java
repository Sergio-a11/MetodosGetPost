package modelo.dao;

import java.util.ArrayList;
import java.util.List;
import modelo.dto.UsuarioDTO;

/**
 *
 * @author Sergio Cruz
 */
public class UsuarioDAO{
    private static final List<UsuarioDTO> lista = new ArrayList<>();
    
    public UsuarioDAO() {
    }
    
    public void datosPruebas()
    {
        UsuarioDTO objU = new UsuarioDTO(1, "Regio", "regional@regio.com", "regiotram", UsuarioDTO.ADMINISTADOR);
        UsuarioDTO objU2 = new UsuarioDTO(2, "Ruka", "ruka@regio.com", "ruka", UsuarioDTO.CLIENTE);
        UsuarioDTO objU3 = new UsuarioDTO(3, "Retro", "retro@regio.com", "retro", UsuarioDTO.VENDEDOR);
        lista.add(objU);
        lista.add(objU2);
        lista.add(objU3);
    }
    
    public boolean crear (UsuarioDTO c)
    {
        if(c!=null)
        {
            lista.add(c);
            return true;
        }
        return false;
    }
    
    public List<UsuarioDTO> readAll()
    {
        List<UsuarioDTO> objL = null;
        objL = UsuarioDAO.lista;
        return objL;
    }
}
