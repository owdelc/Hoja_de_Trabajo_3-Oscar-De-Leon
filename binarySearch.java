/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;
import java.util.ArrayList;
import java.util.function.BinaryOperator;
/**
 *
 * @author oscar
 */
public class binarySearch<E extends Comparable<E>> extends BinaryTree {
    private BinaryTree<E> root;
  
    public binarySearch(){
        this.root = new BinaryTree<>();
    }
    
    private void add(E value){
        BinaryTree<E> newNode = new BinaryTree<>(value);
        if (root.empty() == false){  
            // mo se hace nada por eso lo vacio jajajja
    }
        else{
            setLeft(new BinaryTree<E>());
            setRight(new BinaryTree<E>());
        }       
    }
    
    
}
