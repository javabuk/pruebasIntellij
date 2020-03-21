package org.poc.pruebas.mapper;

public class ConverterBeanCasaImplementacion implements ConverterBeanCasa{

    @Override
    public BeanHouse convertirCasaInHouse(BeanCasa beanCasa) {
        if(beanCasa == null){
            return null;
        }
        BeanHouse beanHouse = new BeanHouse();
        beanHouse.setNumberDoors(beanCasa.getNumeroPuertas());
        beanHouse.setNumberWindows(beanCasa.getNumeroVentanas());
        return beanHouse;
    }

    @Override
    public BeanCasa convertirHouseInCasa(BeanHouse beanHouse) {
        if(beanHouse == null){
            return null;
        }
        BeanCasa beanCasa = new BeanCasa();
        beanCasa.setNumeroPuertas(beanHouse.getNumberDoors());
        beanCasa.setNumeroVentanas(beanHouse.getNumberWindows());
        return beanCasa;
    }
}
