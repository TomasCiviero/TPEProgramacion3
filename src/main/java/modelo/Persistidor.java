package modelo;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class Persistidor {
    public void Persistir() throws Exception
    {
    	IPersistencia idao = new PersistenciaBIN();

        idao.abrirOutput("empresa.bin");
        EmpresaDTO empresaDTO = empresaDTOFromEmpresa();
        idao.escribir(empresaDTO);
        idao.cerrarOutput();

    }

    public void Despersistir() throws Exception{
        IPersistencia idao = new PersistenciaBIN();

        idao.abrirInput("empresa.bin");
        EmpresaDTO empresaDTO = (EmpresaDTO) idao.leer();
        empresaFromEmpresaDTO(empresaDTO);
        idao.cerrarInput();
    }
    public static EmpresaDTO empresaDTOFromEmpresa()
    {
        EmpresaDTO respuesta = new EmpresaDTO();
        HashMap<Integer,Persona> abonados = Empresa.getInstance().getAbonados();
        int idParaContrataciones=Empresa.getInstance().getIdParaContrataciones();
        int idParaFacturas= Empresa.getInstance().getIdParaFacturas();
        respuesta.setIdParaContrataciones(idParaContrataciones);
        respuesta.setAbonados(abonados);
        respuesta.setIdParaFacturas(idParaFacturas);
        return respuesta;
    }

    public static void empresaFromEmpresaDTO(EmpresaDTO empresaDTO)
    {
        Empresa.getInstance().setAbonados(empresaDTO.getAbonados());
        Empresa.getInstance().setIdParaContrataciones(empresaDTO.getIdParaContrataciones());
        Empresa.getInstance().setIdParaFacturas(empresaDTO.getIdParaFacturas());
    }
}