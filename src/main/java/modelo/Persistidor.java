package modelo;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class Persistidor {
    public void Persistir() throws Exception
    {
    	IPersistencia idao = new PersistenciaXML();

        idao.abrirOutput("empresa.xml");
        EmpresaDTO empresaDTO = empresaDTOFromEmpresa();
        idao.escribir(empresaDTO);
        idao.cerrarOutput();

    }

    public void Despersistir() throws Exception{
        IPersistencia idao = new PersistenciaXML();

        idao.abrirInput("empresa.xml");
        EmpresaDTO empresaDTO = (EmpresaDTO) idao.leer();
        empresaFromEmpresaDTO(empresaDTO);
        idao.cerrarInput();
    }
    public static EmpresaDTO empresaDTOFromEmpresa()
    {
        EmpresaDTO respuesta = new EmpresaDTO();
        String nombre = Empresa.getInstance().getNombre();
        HashMap<Integer,Persona> abonados = Empresa.getInstance().getAbonados();
        respuesta.setNombre(nombre);
        respuesta.setAbonados(abonados);
        return respuesta;
    }

    public static void empresaFromEmpresaDTO(EmpresaDTO empresaDTO)
    {
        Empresa.getInstance().setNombre(empresaDTO.getNombre());
        Empresa.getInstance().setAbonados(empresaDTO.getAbonados());
    }
}