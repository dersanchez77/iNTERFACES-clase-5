package ConInterfaces;

import tech.SinInterfaces.Empleado;

import java.util.List;
/// SE DECLARAN LOS METODOS
public interface EmpleadosCrud {
   static void save(Empleado empleado);
   List<Empleado> findAll();
   void delete(Empleado empleado);
}
