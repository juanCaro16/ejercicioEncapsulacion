import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MainProducto {

	public static void main(String[] args) {
		
		//creacion de arraylist para guardar los productos
		ArrayList<Producto> listaProductos = new ArrayList<>();
		
		//agregar 3 productos a la lista
		listaProductos.add(new Producto("camiseta",1000,140));
		listaProductos.add(new Producto("pantalon",1500,90));
		listaProductos.add(new Producto("gorra",900,40));
		
		//bucle para mostrar la informacion
		for (Producto producto : listaProductos) {
			producto.mostrarProductos();
			System.out.println("----------");
			}
		
		listaProductos.get(1).setPrecio(3000);
		
		//eliminar producto de la lista
		listaProductos.remove(0);
		
		//mostrar la informacion actualizada
		for (Producto producto : listaProductos) {
			producto.mostrarProductos();
			System.out.println("----------");
			}
		
		
		String consultaProducto = JOptionPane.showInputDialog("ingrese el nombre del producto");
		Producto productoEncontrado = buscarProducto(listaProductos, consultaProducto);
		
		
	}
	
	//buscar producto
	public static Producto buscarProducto(ArrayList<Producto> listaProductos, String consultaProducto) {
        for (Producto producto : listaProductos) {
            if (producto.getNombre().equalsIgnoreCase(consultaProducto)) {
                JOptionPane.showMessageDialog(null, "producto encontrado");
                producto.mostrarProductos();
                return producto;
            }
        }
        JOptionPane.showMessageDialog(null, "Producto No encontrado");
        return null;
    }
	
}
