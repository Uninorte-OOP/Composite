/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.composite;

import java.util.ArrayList;

/**
 *
 * @author edangulo
 */
public class Composite extends Component {
    
    private ArrayList<Component> components;
    
    public Composite(int data) {
        super(data);
        this.components = new ArrayList<>();
    }
    
    public void addComponent(Component component) {
        this.components.add(component);
    }
    
    public Component getComponent(int index) {
        return this.components.get(index);
    }
    
}
