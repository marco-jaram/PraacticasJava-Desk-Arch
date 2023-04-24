
package com.example.figurasinterfaces;

import org.springframework.stereotype.Component;

@Component
public class Circulo extends Figura {
    private double radio;

    public Circulo() {
        // Constructor vacío
    }

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}

// -----------------------------------------------------------------
// -----------------------------------------------------------------
package com.example.figurasinterfaces;

import org.springframework.stereotype.Component;

@Component
public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado() {
        // Constructor vacío
    }

    public Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
// -----------------------------------------------------------------
// -----------------------------------------------------------------

package com.example.figurasinterfaces;

import org.springframework.stereotype.Component;

@Component
public class Figura {
    private String color;

    public Figura() {
        // Constructor vacío
    }

    public Figura(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double calcularArea() {
        return 0;
    }
}

// -----------------------------------------------------------------
// -----------------------------------------------------------------

package com.example.figurasinterfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestFigura {
    @Autowired
    private Circulo circulo;

    @Autowired
    private Cuadrado cuadrado;

    @Autowired
    private Rectangulo rectangulo;

    public void imprimirArea() {
        System.out.println("El color del círculo es " + circulo.getColor() + " y tiene un área de " + circulo.calcularArea());
        System.out.println("El color del cuadrado es " + cuadrado.getColor() + " y tiene un área de " + cuadrado.calcularArea());
        System.out.println("El color del rectángulo es " + rectangulo.getColor() + " y tiene un área de " + rectangulo.calcularArea());
    }
}
