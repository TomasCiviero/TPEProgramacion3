package org.example;
public class Main {
    public static void main(String[] args) {
        ContratacionViviendaFactory contratacionViviendaFactory = new ContratacionViviendaFactory();
        ContratacionComercioFactory contratacionComercioFactory = new ContratacionComercioFactory();
        FacturaFisicaFactory facturaFisicaFactory = new FacturaFisicaFactory();
        FacturaJuridicaFactory facturaJuridicaFactory = new FacturaJuridicaFactory();
        PromocionDoradaFactory promocionDoradaFactory = new PromocionDoradaFactory();
        PromocionPlatinoFactory promocionPlatinoFactory = new PromocionPlatinoFactory();
        PersonaFisicaFactory personaFisicaFactory = new PersonaFisicaFactory();
        PersonaJuridicaFactory personaJuridicaFactory = new PersonaJuridicaFactory();
        DomicilioFactory domicilioFactory = new DomicilioFactory();
        DecoratorChequeFactory decoratorChequeFactory = new DecoratorChequeFactory();
        DecoratorEfectivoFactory decoratorEfectivoFactory = new DecoratorEfectivoFactory();
        DecoratorTarjetaFactory decoratorTarjetaFactory = new DecoratorTarjetaFactory();

        /*
        CASOS
        PERSONA, COMERCIO Y/O VIVIENDA, CANTDOMICILIOS, PROMOCION, MEDIO DE PAGO
        */
        /*
        CASO 1
        Persona Fisica, 1 domicilio comercio, promocion dorada, efectivo
         */
        Promocion promoDorada1 = promocionDoradaFactory.crearPromocion();
        PersonaFisica pFis1 = (PersonaFisica) personaFisicaFactory.crearPersona();
        Domicilio dom1 = domicilioFactory.crearDomicilio("Calle", 123);
        Contratacion contraViv1 = contratacionViviendaFactory.crearContratacion(1,1,1,dom1);
        FacturaFisica facFis1 = (FacturaFisica) facturaFisicaFactory.crearFactura(pFis1);
        DecoratorEfectivo decEfec1 = (DecoratorEfectivo) decoratorEfectivoFactory.crearDecoratorMetodoDepago(facFis1);

        Empresa.getInstance().setPromocion(promoDorada1);
        Empresa.getInstance().getPromocion().aplicarPromocion(contraViv1);
        pFis1.agregarDomicilio(dom1);
        facFis1.agregarContratacion(contraViv1);
        decEfec1.calcular();
    }
}