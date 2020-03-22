
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.swing.text.StyleConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oscar
 */
public class BinaryTree<E>
{
    protected BinaryTree<E> parent;
    protected BinaryTree<E> left,right;
    private E val;
    public boolean empty;
    
    public boolean empty(){
        return val ==null;
        
    }
   
    public void setLeft(BinaryTree<E> newleft) {
        left = newleft;
          
    }

    public void setRight(BinaryTree<E> newright) {
        right = newright;
    }
   
    
    public BinaryTree(){
       val = null;
       parent= null; left = right = this;
    }
    public BinaryTree(E value){
        this.val = value;
        setLeft(new BinaryTree<>());
        setRight(new BinaryTree<>());
        
    }
    
    public BinaryTree(E value, BinaryTree<E> left, BinaryTree<E> right){
       
        val = value;
        if (this.left == null) {
            left = new BinaryTree<E>();}
        setLeft(left);
        if (this.right == null) {
            right = new BinaryTree<E>();}
        setRight(right);
       
    }
    
    public BinaryTree<E> left(){
        return left;
    }
    
    protected void setParent(BinaryTree<E> newParent){
      if(empty == false){
          parent = newParent;
      }  
    }
    
    
}