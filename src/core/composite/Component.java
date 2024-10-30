/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.composite;

/**
 *
 * @author edangulo
 */
public abstract class Component {
    
    protected int data;

    public Component(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }
    
}
