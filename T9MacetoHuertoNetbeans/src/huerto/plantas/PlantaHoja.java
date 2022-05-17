/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Java Plantilla.java to edit this template
 */
package huerto.plantas;

import huerto.enums.Familia;

/**
 * Clase Abstracta para crear objetos del tipo Planta Hoja heredando
 * caracteristicas de la clase Planta
 *
 *
 * @time 8 may 2022 17:42:07
 * @author RVS
 */
public abstract class PlantaHoja extends Planta {

  /**
   * Construtor parametrizado
   *
   * Cada objeto que instanciemos con esta clase se le establecera por parametro
   * una serie de caracteristicas y se le asignara automáticamente un tipo Enum
   * definido como Familia.Fruto
   *
   * @param nombre - String : Establece el nombre la planta con Fruto dentro del
   * objeto PlantaHoja
   * @param distancia - int : Establece la distancia de la planta con Fruto
   * dentro del objeto PlantaHoja
   * @param litros - int : Establece los litros de sustrato de la planta con Fruto dentro
   * del objeto PlantaHoja
   */
  protected PlantaHoja(String nombre, int distancia, int litros) {
    super(nombre, distancia, litros);
// Todos los objetos de la clase PlantaHoja que creemos tendrán definido un tipo enum Hoja mediante el enumerado Familia
    familia = Familia.HOJA;
  }

}
