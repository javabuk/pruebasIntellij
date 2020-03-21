package org.poc.pruebas.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

public class PruebaMapper {

    public static void main(String[] args) {

        BeanCasa beanCasa = new BeanCasa(1, 4);

        /*ConverterBeanCasaImpl mapper = Mappers.getMapper(ConverterBeanCasaImpl.class);
        BeanHouse beanHouse = mapper.convertirCasaInHouse(beanCasa);
        System.out.print(beanHouse.toString());*/

        ConverterBeanCasaImplementacion mapperImple = Mappers.getMapper(ConverterBeanCasaImplementacion.class);
        BeanHouse house = mapperImple.convertirCasaInHouse(beanCasa);
        System.out.println(house.toString());


    }
}
