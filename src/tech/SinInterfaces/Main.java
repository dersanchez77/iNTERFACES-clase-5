package tech.SinInterfaces;


import java.util.List;

public class Main {
    public static <Empleados> void main(String[] args) {
        EmpleadosCrud empleadosCrud=new EmpleadosCrud();
        Empleado Juanito= new Empleado ("Juanito", 30, 40000, true);
        Empleado Patricia= new Empleado ("Patricia", 30, 40000, true);
        Empleado Roberto= new Empleado ("Roberto", 30, 40000, true);
        empleadosCrud.save(Juanito);
        empleadosCrud.save(Patricia);
        empleadosCrud.save(Roberto);
        List<Empleados> empleados= (List<Empleados>) empleadosCrud.findAll();
    }
}
