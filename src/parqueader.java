import javax.swing.*;

public class parqueader {


        public static void main(String[] args) {

            String nombre;
            String placa;
            double hora_entrada;
            double hora_salida;
            double valor, dato = 1;
            double resta, mult;

            JOptionPane.showMessageDialog(null, "======================================= \n" +
                    "bienvenido al parqueadero V \n" +
                    "el costo por hora\n" +
                    "carro: 2000\n" + "moto: 1000\n" +
                    "=================================================");
            nombre = JOptionPane.showInputDialog("porfavor ingrese su nombre: ");
            placa = JOptionPane.showInputDialog("porfavor ingrese su placa");
            hora_entrada = Double.parseDouble(JOptionPane.showInputDialog("porfavor ingrese la hora en la que ingreso"));
            hora_salida = Double.parseDouble(JOptionPane.showInputDialog("PORFAVOR INGRESE LA HORA EN QUE SALIO "));
            valor = Double.parseDouble(JOptionPane.showInputDialog("Porfavor escriba 1 si su automuvil es un carro pero si no escriba 2 si es moto"));
            resta = hora_salida - hora_entrada;

            if (valor == dato) {
                mult = Math.ceil(resta) * valor * 2000;
            } else {
                mult = Math.ceil(resta) * valor * 1000;
            }

            JOptionPane.showMessageDialog(null, "su nombre es:" + nombre + "\n" +
                    "su placa es:" + placa + "\n" +
                    "la hora en que ingreso es:" + hora_entrada + "\n" +
                    "la hora en que salio es :" + hora_salida + "\n" +
                    "tiene que pagar :" + mult);
            switch ((int) valor) {
                case 1:
                    mult = Math.ceil(resta) * 2000;
                    JOptionPane.showMessageDialog(null, "valor a pagar por su carro es:" + mult);
                case 2:
                    mult = Math.ceil(resta) * 1000;

                    JOptionPane.showMessageDialog(null, "valor a pagar por su moto es:" + mult);

                    defauld :
                    JOptionPane.showMessageDialog(null, "el valor no existe");

            }
        }
    }


