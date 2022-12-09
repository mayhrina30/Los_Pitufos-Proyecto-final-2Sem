
package domain;

import java.util.Scanner;


public class BonoDeSueldo {
    int op;
    Scanner entrada = new Scanner(System.in);
  
    
    
    public void menu(){
        int op,n;
        
       Empleado empleados[];
        
                 
        do{
              System.out.println("Elija el idioma preferido/Choose the language");
        System.out.println(" 1-Español \n"
                         + " 2-Ingles \n"
                         + " 3-Salir");
                System.out.println("Elija una opción (1-3):");
		System.out.println("Choose an option (1-3):");
                op=entrada.nextInt();         
                        switch(op){
                            case 1:
                            case 2:
                                 if (op==1) {
                    System.out.println("Ingrese la cantidad de empleados");
            } else {
                    System.out.println("Enter the numbers of workers");
            }
                                 n=entrada.nextInt();
                                 empleados= new Empleado[n];
                                
                                cantEmpleados(empleados,op,n);
                                break;
                            case 3:
                                System.out.println("Gracias, vuelva prontos!");
                                break;
                            default:
                                System.out.println("Opcion no valida,ingresela nuevamente");
                                break;
                        }
                
                
                
        }while(op!=3);
      
    }
    //OPCION EN ESPAÑOL Y EN INGLES
    
    public void cantEmpleados(Empleado empleados[],int op,int n){
        
        int cantHoras;
        String name;
        double precioPorHora;
        for (int i = 0; i < n; i++) {
            if(op==1){
                 System.out.println("Ingrese el nombre del empleado: "+(i+1));
            }else{
                System.out.println("Type the name of the worker: "+(i+1));
            }
            
            
           empleados[i]=new Empleado();
           empleados[i].setNombre(entrada.next());
            
           
            if(op==1){
                 System.out.println("Digite la cantidad de horas trabajadas ");
            }else{
                System.out.println("type the amount of hours worked " );
            }
            cantHoras=entrada.nextInt();
             empleados[i].setCantHorasTrabajadas(cantHoras);
             
             
                        if(op==1){
                 System.out.println("Ingrese el precio por hora trabajada del empleado ");
            }else{
                System.out.println("type the price of hours worked");
            }
             precioPorHora=entrada.nextDouble();
             empleados[i].setPrecioPorHoraTrabajada(precioPorHora);

        }
        
        cobroEmpleado(empleados,op);
        
    }
    
    public void cobroEmpleado(Empleado empleados[],int op){
        double descObraSocial, descAportes, presentismo, sueldoBruto,sueldoNetoACobrar;
        for (int i = 0; i <empleados.length; i++) {
            sueldoBruto=empleados[i].getCantHorasTrabajadas()*empleados[i].getPrecioPorHoraTrabajada();
        descAportes=sueldoBruto*0.11;
        descObraSocial=sueldoBruto*0.06;
        sueldoNetoACobrar=sueldoBruto-descAportes-descObraSocial;
        if (op==1) {
            System.out.println("Empleado: "+empleados[i].getNombre());
            System.out.println("El sueldo bruto del empleado es: "+sueldoBruto);
            System.out.println("El descuento por aportes jubilatorio es de: "+descAportes);
            System.out.println("El descuento por aportes a la obra social es de: "+descObraSocial);
             System.out.println("El sueldo neto a cobrar a fin de mes es de: "+sueldoNetoACobrar);
             empleados[i].setSueldoNeto(sueldoNetoACobrar);
        }else{
            System.out.println("The employee s gross salary is: "+sueldoBruto);
            System.out.println("The discount for retirement contributions is: "+descAportes);
            System.out.println("The discount for contributions to social work is:  "+descObraSocial);
            System.out.println("The net salary to be received at the end of the month is: "+sueldoNetoACobrar);
            empleados[i].setSueldoNeto(sueldoNetoACobrar);
        }
        }
        
            comisionVenta(empleados, op);
    }
    
    public void comisionVenta(Empleado empleados[],int op){
        
        double suma,precioVenta,comisiones;
        int ventas;
        
        for (int i = 0; i < empleados.length; i++) {
            if (op==1) {
            System.out.println("***************************");
            System.out.println("**Extra por comisiones de Ventas**");
            System.out.println("***************************");
            System.out.println("Ingrese la cantidad de ventas correspondientes del mes");
            
        } else {
            System.out.println("***************************");
            System.out.println("**Extra for sales comissions**");
            System.out.println("***************************");
            System.out.println("enter the sales made in the corresponding month");
            
        }
        ventas=entrada.nextInt();
        
        suma=0;
        if (ventas>0) {
            for ( int j = 0; j <ventas; j++) {
                if (op==1) {
                    System.out.println("Ingrese el valor de cada venta");
                } else {
                    System.out.println("Enter the value of each sale");
                }
                precioVenta=entrada.nextDouble();
                suma=suma+precioVenta;
           }
            comisiones=suma*0.10;
            System.out.println("Empleado: "+empleados[i].getNombre());
            if (op==1) {
                System.out.println("Las comisiones fueron de: "+comisiones);
                System.out.println("su suedo a cobrar con comisiones es de: "+(comisiones+empleados[i].getSueldoNeto()));
            } else {
                System.out.println("the comissions were: "+comisiones);
                System.out.println("your total salary to collect with commissions: "+(comisiones+empleados[i].getSueldoNeto()));
            }
        }else{
            
            if(op==1){
                System.out.println("su sueldo total fue de: "+empleados[i].getSueldoNeto());
            }else{
                System.out.println("The total salary to be received is: "+empleados[i].getSueldoNeto());
            }
        }
        }
        
        
    }
      
}
