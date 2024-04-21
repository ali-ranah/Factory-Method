/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rana Saim Ali
 */

public class PhoneConcreteFactory extends ProductAbstractFactory {
    @Override
    protected IProduct makeProduct() {
        return new Phone();
    }
}