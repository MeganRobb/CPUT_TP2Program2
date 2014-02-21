/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.tpprog2;

import com.meganrobb.tpprog2.service.ProgramService;
import org.junit.Ignore;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author student
 */
public class ProgramTest {
    
    private static ProgramService service;
    
    public ProgramTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    
    //Ignoring test
    @Ignore
    public void failAss(){
        //Failing a test
        Assert.fail(service.failedMsg("Good Day"));
        
    }
    /*@Test
    public void assertArrays() {
    //Assert Arrays
    String[] names = new String[] {"megan","tracy","jaco"};
    String[] vnames = new String[] {"megan","tracy","jaco"};
   
    Assert.assertArrayEquals("Two arrays are not equal",names,vnames);
    }*/
    
    //Exception Assert
    @Test(expectedExceptions = NullPointerException.class)
    public void exceptionAssertion() throws Exception{
        service.divide(5,0);
        
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
