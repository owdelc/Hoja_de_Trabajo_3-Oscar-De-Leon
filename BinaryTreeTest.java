/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author oscar
 */
public class BinaryTreeTest {
    
    public BinaryTreeTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of empty method, of class BinaryTree.
     */
    @Test
    public void testEmpty() {
        System.out.println("empty");
        BinaryTree instance = new BinaryTree();
        boolean expResult = false;
        boolean result = instance.empty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLeft method, of class BinaryTree.
     */
    @Test
    public void testSetLeft() {
        System.out.println("setLeft");
        BinaryTree instance = new BinaryTree();
        instance.setLeft(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRight method, of class BinaryTree.
     */
    @Test
    public void testSetRight() {
        System.out.println("setRight");
        BinaryTree instance = new BinaryTree();
        instance.setRight(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of left method, of class BinaryTree.
     */
    @Test
    public void testLeft() {
        System.out.println("left");
        BinaryTree instance = new BinaryTree();
        BinaryTree expResult = null;
        BinaryTree result = instance.left();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setParent method, of class BinaryTree.
     */
    @Test
    public void testSetParent() {
        System.out.println("setParent");
        BinaryTree instance = new BinaryTree();
        instance.setParent(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
