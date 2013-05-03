package randoop;

import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test1");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var0 = lexer.Clavier.lireDouble();
      fail("Expected exception of type randoop.util.ReflectionExecutor.TimeoutExceeded");
    } catch (randoop.util.ReflectionExecutor.TimeoutExceeded e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test2");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      token.Token var0 = lexer.Lexer.getToken();
      fail("Expected exception of type randoop.util.ReflectionExecutor.TimeoutExceeded");
    } catch (randoop.util.ReflectionExecutor.TimeoutExceeded e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test3");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      token.Op var1 = token.Op.valueOf("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test4");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var0 = lexer.Clavier.lireInt();
      fail("Expected exception of type randoop.util.ReflectionExecutor.TimeoutExceeded");
    } catch (randoop.util.ReflectionExecutor.TimeoutExceeded e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test5");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      token.Value var0 = parameters.Memory.retourne();
      fail("Expected exception of type parameters.MemoryException");
    } catch (parameters.MemoryException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test6");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var0 = lexer.Clavier.lireString();
      fail("Expected exception of type randoop.util.ReflectionExecutor.TimeoutExceeded");
    } catch (randoop.util.ReflectionExecutor.TimeoutExceeded e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test7");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var0 = lexer.Clavier.lireLong();
      fail("Expected exception of type randoop.util.ReflectionExecutor.TimeoutExceeded");
    } catch (randoop.util.ReflectionExecutor.TimeoutExceeded e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test8");


    Moteur.Moteur var0 = new Moteur.Moteur();

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test9");


    token.Instruction[] var0 = token.Instruction.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test10");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      token.Value var0 = stack.Stack.retrieveValue();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test11");


    parameters.MemoryException var1 = new parameters.MemoryException("hi!");
    parameters.MemoryException var3 = new parameters.MemoryException("hi!");
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.Throwable[] var5 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test12");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      char var0 = lexer.Clavier.lireChar();
      fail("Expected exception of type randoop.util.ReflectionExecutor.TimeoutExceeded");
    } catch (randoop.util.ReflectionExecutor.TimeoutExceeded e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test13");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      token.Instruction var1 = token.Instruction.valueOf("0");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test14");


    AST.MyInput var0 = new AST.MyInput();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parse();
      fail("Expected exception of type java.lang.Error");
    } catch (java.lang.Error e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test15");


    parameters.ModeManager var0 = new parameters.ModeManager();

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test16");


    AST.CalculInt var0 = new AST.CalculInt();
    token.Num var2 = new token.Num((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parse((token.Token)var2);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test17");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var0 = lexer.Clavier.lireFloat();
      fail("Expected exception of type randoop.util.ReflectionExecutor.TimeoutExceeded");
    } catch (randoop.util.ReflectionExecutor.TimeoutExceeded e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test18");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      token.Instruction var1 = token.Instruction.valueOf("No value is recorded for hi! mode \n Please start a new calculation");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test19");


    parameters.Memory var0 = new parameters.Memory();

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test20");


    token.Num var1 = new token.Num(0);
    java.lang.String var2 = var1.toString();
    stack.Stack.addElement((token.Value)var1);
    stack.Stack.addElement((token.Value)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "0"+ "'", var2.equals("0"));

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test21");


    AST.CalculInt var0 = new AST.CalculInt();
    token.Num var2 = new token.Num(0);
    java.lang.String var3 = var2.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parse((token.Token)var2);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "0"+ "'", var3.equals("0"));

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test22");


    token.Op[] var0 = token.Op.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test23");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      token.Op var1 = token.Op.valueOf("No hi! value registered");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test24");


    parameters.MemoryException var1 = new parameters.MemoryException("No value is recorded for hi! mode \n Please start a new calculation");

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test25");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      token.Instruction var1 = token.Instruction.valueOf("No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test26");


    AST.CalculInt var0 = new AST.CalculInt();
    token.Num var2 = new token.Num(0);
    parameters.Memory.remember((token.Value)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parse((token.Token)var2);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test27");


    token.Float var1 = new token.Float(100.0d);
    java.lang.Double var2 = var1.getValue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      parameters.Memory.remember((token.Value)var1);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 100.0d+ "'", var2.equals(100.0d));

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test28");


    int var0 = stack.Stack.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 1);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test29");


    AST.CalculInt var0 = new AST.CalculInt();
    token.Num var2 = new token.Num(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parse((token.Token)var2);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test30");


    token.Num var1 = new token.Num(0);
    boolean var2 = parameters.ModeManager.rightType((token.Value)var1);
    parameters.Memory.remember((token.Value)var1);
    java.lang.String var4 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "0"+ "'", var4.equals("0"));

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test31");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      token.Op var1 = token.Op.valueOf("No No hi! value registered value registered");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test32");


    AST.Input var0 = new AST.Input();

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test33");


    AST.BaseInt var0 = new AST.BaseInt();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parse();
      fail("Expected exception of type java.lang.Error");
    } catch (java.lang.Error e) {
      // Expected exception.
    }

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test34");


    lexer.Lexer var0 = new lexer.Lexer();

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test35");


    Exceptions.InterruptingException var1 = new Exceptions.InterruptingException("-1");

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test36");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      token.Instruction var1 = token.Instruction.valueOf("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test37");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      token.Instruction var1 = token.Instruction.valueOf("-1");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test38");


    AST.BaseInt var0 = new AST.BaseInt();
    token.Num var2 = new token.Num(0);
    boolean var3 = parameters.ModeManager.rightType((token.Value)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parse((token.Token)var2);
      fail("Expected exception of type java.lang.Error");
    } catch (java.lang.Error e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test39");


    token.Num var1 = new token.Num(1);
    java.lang.Integer var2 = var1.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 1+ "'", var2.equals(1));

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test40");


    AST.BaseInt var0 = new AST.BaseInt();
    token.Num var2 = new token.Num(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parse((token.Token)var2);
      fail("Expected exception of type java.lang.Error");
    } catch (java.lang.Error e) {
      // Expected exception.
    }

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test41");


    lexer.Clavier var0 = new lexer.Clavier();

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test42");


    parameters.MemoryException var1 = new parameters.MemoryException("No hi! value registered");
    java.lang.String var2 = var1.toString();
    java.lang.String var3 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "No No hi! value registered value registered"+ "'", var2.equals("No No hi! value registered value registered"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "No No hi! value registered value registered"+ "'", var3.equals("No No hi! value registered value registered"));

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test43");


    token.Num var1 = new token.Num(0);
    java.lang.String var2 = var1.toString();
    parameters.Memory.remember((token.Value)var1);
    parameters.Memory.remember((token.Value)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "0"+ "'", var2.equals("0"));

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test44");


    Exceptions.InterruptingException var1 = new Exceptions.InterruptingException("No value is recorded for hi! mode \n Please start a new calculation");

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test45");


    token.Num var1 = new token.Num(0);
    parameters.Memory.remember((token.Value)var1);
    parameters.Memory.remember((token.Value)var1);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test46");


    lexer.InputException var0 = new lexer.InputException();
    parameters.MemoryException var2 = new parameters.MemoryException("hi!");
    parameters.MemoryException var4 = new parameters.MemoryException("hi!");
    var2.addSuppressed((java.lang.Throwable)var4);
    var0.addSuppressed((java.lang.Throwable)var4);
    java.lang.String var7 = var4.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "No hi! value registered"+ "'", var7.equals("No hi! value registered"));

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test47");


    AST.CalculInt var0 = new AST.CalculInt();
    token.Float var2 = new token.Float(100.0d);
    java.lang.Double var3 = var2.getValue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parse((token.Token)var2);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 100.0d+ "'", var3.equals(100.0d));

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test48");


    Exceptions.InterruptingException var1 = new Exceptions.InterruptingException("No No hi! value registered value registered");
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation"+ "'", var2.equals("No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation"));

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test49");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      token.Instruction var1 = token.Instruction.valueOf("No No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation value registered");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test50");


    AST.BaseInt var0 = new AST.BaseInt();
    token.Num var2 = new token.Num(0);
    java.lang.String var3 = var2.toString();
    parameters.Memory.remember((token.Value)var2);
    java.lang.String var5 = var2.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parse((token.Token)var2);
      fail("Expected exception of type java.lang.Error");
    } catch (java.lang.Error e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "0"+ "'", var3.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "0"+ "'", var5.equals("0"));

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test51");


    AST.BaseInt var0 = new AST.BaseInt();
    token.Num var2 = new token.Num(0);
    java.lang.Integer var3 = var2.getValue();
    java.lang.String var4 = var2.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parse((token.Token)var2);
      fail("Expected exception of type java.lang.Error");
    } catch (java.lang.Error e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0+ "'", var3.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "0"+ "'", var4.equals("0"));

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test52");


    Exceptions.InterruptingException var1 = new Exceptions.InterruptingException("No No hi! value registered value registered");
    java.lang.String var2 = var1.toString();
    java.lang.String var3 = var1.toString();
    parameters.MemoryException var5 = new parameters.MemoryException("No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation");
    java.lang.String var6 = var5.toString();
    var1.addSuppressed((java.lang.Throwable)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation"+ "'", var2.equals("No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation"+ "'", var3.equals("No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "No No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation value registered"+ "'", var6.equals("No No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation value registered"));

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test53");


    token.Num var1 = new token.Num(0);
    java.lang.String var2 = var1.toString();
    java.lang.Integer var3 = var1.getValue();
    boolean var4 = parameters.ModeManager.rightType((token.Value)var1);
    java.lang.Integer var5 = var1.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "0"+ "'", var2.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0+ "'", var3.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0+ "'", var5.equals(0));

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test54");


    AST.CalculInt var0 = new AST.CalculInt();
    token.Num var2 = new token.Num(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parse((token.Token)var2);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test55");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      token.Op var1 = token.Op.valueOf("You cannot divide by zero");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test56");


    Exceptions.InterruptingException var1 = new Exceptions.InterruptingException("You cannot divide by zero");

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test57");


    parameters.MemoryException var1 = new parameters.MemoryException("hi!");
    parameters.MemoryException var3 = new parameters.MemoryException("hi!");
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.String var5 = var1.toString();
    parameters.MemoryException var7 = new parameters.MemoryException("hi!");
    var1.addSuppressed((java.lang.Throwable)var7);
    java.lang.Throwable[] var9 = var7.getSuppressed();
    Exceptions.InterruptingException var11 = new Exceptions.InterruptingException("0");
    var7.addSuppressed((java.lang.Throwable)var11);
    boolean var13 = token.Instruction.isModeInstruction((java.lang.Object)var11);
    java.lang.String var14 = var11.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "No hi! value registered"+ "'", var5.equals("No hi! value registered"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "No value is recorded for 0 mode \n Please start a new calculation"+ "'", var14.equals("No value is recorded for 0 mode \n Please start a new calculation"));

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test58");


    parameters.MemoryException var1 = new parameters.MemoryException("hi!");
    parameters.MemoryException var3 = new parameters.MemoryException("hi!");
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.String var5 = var1.toString();
    parameters.MemoryException var7 = new parameters.MemoryException("hi!");
    var1.addSuppressed((java.lang.Throwable)var7);
    java.lang.Throwable[] var9 = var7.getSuppressed();
    Exceptions.InterruptingException var11 = new Exceptions.InterruptingException("0");
    var7.addSuppressed((java.lang.Throwable)var11);
    java.lang.String var13 = var7.toString();
    boolean var14 = token.Instruction.isModeInstruction((java.lang.Object)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "No hi! value registered"+ "'", var5.equals("No hi! value registered"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "No hi! value registered"+ "'", var13.equals("No hi! value registered"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test59");


    AST.BaseInt var0 = new AST.BaseInt();
    token.Num var2 = new token.Num(0);
    java.lang.String var3 = var2.toString();
    java.lang.Integer var4 = var2.getValue();
    parameters.Memory.remember((token.Value)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parse((token.Token)var2);
      fail("Expected exception of type java.lang.Error");
    } catch (java.lang.Error e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "0"+ "'", var3.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0+ "'", var4.equals(0));

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test60");


    AST.BaseInt var0 = new AST.BaseInt();
    token.Num var2 = new token.Num((-1));
    java.lang.String var3 = var2.toString();
    parameters.Memory.remember((token.Value)var2);
    boolean var5 = parameters.ModeManager.rightType((token.Value)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parse((token.Token)var2);
      fail("Expected exception of type java.lang.Error");
    } catch (java.lang.Error e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "-1"+ "'", var3.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test61");


    AST.CalculInt var0 = new AST.CalculInt();
    token.Num var2 = new token.Num(0);
    java.lang.String var3 = var2.toString();
    java.lang.Integer var4 = var2.getValue();
    parameters.Memory.remember((token.Value)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parse((token.Token)var2);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "0"+ "'", var3.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0+ "'", var4.equals(0));

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test62");


    AST.CalculInt var0 = new AST.CalculInt();
    token.Num var2 = new token.Num(0);
    stack.Stack.addElement((token.Value)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parse((token.Token)var2);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test63");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      token.Op var1 = token.Op.valueOf("No value is recorded for hi! mode \n Please start a new calculation");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test64");


    parameters.MemoryException var1 = new parameters.MemoryException("hi!");
    parameters.MemoryException var3 = new parameters.MemoryException("hi!");
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.String var5 = var1.toString();
    parameters.MemoryException var7 = new parameters.MemoryException("hi!");
    var1.addSuppressed((java.lang.Throwable)var7);
    java.lang.Throwable[] var9 = var7.getSuppressed();
    Exceptions.InterruptingException var11 = new Exceptions.InterruptingException("0");
    var7.addSuppressed((java.lang.Throwable)var11);
    java.lang.String var13 = var11.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "No hi! value registered"+ "'", var5.equals("No hi! value registered"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "No value is recorded for 0 mode \n Please start a new calculation"+ "'", var13.equals("No value is recorded for 0 mode \n Please start a new calculation"));

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test65");


    AST.BaseInt var0 = new AST.BaseInt();
    token.Num var2 = new token.Num((-1));
    java.lang.String var3 = var2.toString();
    parameters.Memory.remember((token.Value)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parse((token.Token)var2);
      fail("Expected exception of type java.lang.Error");
    } catch (java.lang.Error e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "-1"+ "'", var3.equals("-1"));

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test66");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      token.Op var1 = token.Op.valueOf("100.0");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test67");


    token.Num var1 = new token.Num((-1));
    java.lang.String var2 = var1.toString();
    java.lang.String var3 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "-1"+ "'", var2.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "-1"+ "'", var3.equals("-1"));

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test68");


    parameters.MemoryException var1 = new parameters.MemoryException("hi!");
    parameters.MemoryException var3 = new parameters.MemoryException("hi!");
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.String var5 = var1.toString();
    parameters.MemoryException var7 = new parameters.MemoryException("hi!");
    var1.addSuppressed((java.lang.Throwable)var7);
    java.lang.Throwable[] var9 = var7.getSuppressed();
    Exceptions.InterruptingException var11 = new Exceptions.InterruptingException("0");
    var7.addSuppressed((java.lang.Throwable)var11);
    boolean var13 = token.Instruction.isModeInstruction((java.lang.Object)var11);
    parameters.MemoryException var15 = new parameters.MemoryException("No hi! value registered");
    java.lang.Throwable[] var16 = var15.getSuppressed();
    var11.addSuppressed((java.lang.Throwable)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "No hi! value registered"+ "'", var5.equals("No hi! value registered"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test69");


    parameters.MemoryException var1 = new parameters.MemoryException("hi!");
    parameters.MemoryException var3 = new parameters.MemoryException("hi!");
    var1.addSuppressed((java.lang.Throwable)var3);
    boolean var5 = token.Instruction.isModeInstruction((java.lang.Object)var3);
    java.lang.String var6 = var3.toString();
    java.lang.String var7 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "No hi! value registered"+ "'", var6.equals("No hi! value registered"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "No hi! value registered"+ "'", var7.equals("No hi! value registered"));

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test70");


    lexer.UnexistingToken var1 = new lexer.UnexistingToken("No hi! value registered");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test71");


    Exceptions.InterruptingException var1 = new Exceptions.InterruptingException("hi!");
    java.lang.String var2 = var1.toString();
    java.lang.String var3 = var1.toString();
    java.lang.Throwable[] var4 = var1.getSuppressed();
    java.lang.String var5 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "No value is recorded for hi! mode \n Please start a new calculation"+ "'", var2.equals("No value is recorded for hi! mode \n Please start a new calculation"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "No value is recorded for hi! mode \n Please start a new calculation"+ "'", var3.equals("No value is recorded for hi! mode \n Please start a new calculation"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "No value is recorded for hi! mode \n Please start a new calculation"+ "'", var5.equals("No value is recorded for hi! mode \n Please start a new calculation"));

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test72");


    AST.CalculInt var0 = new AST.CalculInt();
    token.Float var2 = new token.Float(100.0d);
    java.lang.Double var3 = var2.getValue();
    java.lang.String var4 = var2.toString();
    java.lang.Double var5 = var2.getValue();
    java.lang.String var6 = var2.toString();
    java.lang.String var7 = var2.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parse((token.Token)var2);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 100.0d+ "'", var3.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "100.0"+ "'", var4.equals("100.0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 100.0d+ "'", var5.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "100.0"+ "'", var6.equals("100.0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100.0"+ "'", var7.equals("100.0"));

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test73");


    AST.CalculInt var0 = new AST.CalculInt();
    token.Num var2 = new token.Num(0);
    java.lang.String var3 = var2.toString();
    stack.Stack.addElement((token.Value)var2);
    java.lang.String var5 = var2.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parse((token.Token)var2);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "0"+ "'", var3.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "0"+ "'", var5.equals("0"));

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test74");


    token.Num var1 = new token.Num(0);
    java.lang.Integer var2 = var1.getValue();
    java.lang.String var3 = var1.toString();
    boolean var4 = parameters.ModeManager.rightType((token.Value)var1);
    java.lang.String var5 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 0+ "'", var2.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "0"+ "'", var3.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "0"+ "'", var5.equals("0"));

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test75");


    parameters.MemoryException var1 = new parameters.MemoryException("hi!");
    parameters.MemoryException var3 = new parameters.MemoryException("hi!");
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.String var5 = var1.toString();
    parameters.MemoryException var7 = new parameters.MemoryException("hi!");
    var1.addSuppressed((java.lang.Throwable)var7);
    java.lang.Throwable[] var9 = var7.getSuppressed();
    java.lang.Throwable[] var10 = var7.getSuppressed();
    java.lang.String var11 = var7.toString();
    java.lang.String var12 = var7.toString();
    java.lang.String var13 = var7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "No hi! value registered"+ "'", var5.equals("No hi! value registered"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "No hi! value registered"+ "'", var11.equals("No hi! value registered"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "No hi! value registered"+ "'", var12.equals("No hi! value registered"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "No hi! value registered"+ "'", var13.equals("No hi! value registered"));

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test76");


    token.Num var1 = new token.Num((-1));
    java.lang.String var2 = var1.toString();
    parameters.Memory.remember((token.Value)var1);
    java.lang.String var4 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "-1"+ "'", var2.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "-1"+ "'", var4.equals("-1"));

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test77");


    token.Num var1 = new token.Num(0);
    stack.Stack.addElement((token.Value)var1);
    stack.Stack.addElement((token.Value)var1);
    java.lang.String var4 = var1.toString();
    boolean var5 = parameters.ModeManager.rightType((token.Value)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "0"+ "'", var4.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test78");


    parameters.MemoryException var1 = new parameters.MemoryException("hi!");
    parameters.MemoryException var3 = new parameters.MemoryException("hi!");
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.String var5 = var1.toString();
    java.lang.String var6 = var1.toString();
    java.lang.String var7 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "No hi! value registered"+ "'", var5.equals("No hi! value registered"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "No hi! value registered"+ "'", var6.equals("No hi! value registered"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "No hi! value registered"+ "'", var7.equals("No hi! value registered"));

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test79");


    Exceptions.InterruptingException var1 = new Exceptions.InterruptingException("0");
    java.lang.String var2 = var1.toString();
    java.lang.String var3 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "No value is recorded for 0 mode \n Please start a new calculation"+ "'", var2.equals("No value is recorded for 0 mode \n Please start a new calculation"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "No value is recorded for 0 mode \n Please start a new calculation"+ "'", var3.equals("No value is recorded for 0 mode \n Please start a new calculation"));

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test80");


    Exceptions.InterruptingException var1 = new Exceptions.InterruptingException("The token you entered (No hi! value registered) doesn't match any token of the grammar");
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "No value is recorded for The token you entered (No hi! value registered) doesn't match any token of the grammar mode \n Please start a new calculation"+ "'", var2.equals("No value is recorded for The token you entered (No hi! value registered) doesn't match any token of the grammar mode \n Please start a new calculation"));

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test81");


    parameters.MemoryException var1 = new parameters.MemoryException("No hi! value registered");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    java.lang.String var3 = var1.toString();
    java.lang.Throwable[] var4 = var1.getSuppressed();
    java.lang.String var5 = var1.toString();
    java.lang.String var6 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "No No hi! value registered value registered"+ "'", var3.equals("No No hi! value registered value registered"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "No No hi! value registered value registered"+ "'", var5.equals("No No hi! value registered value registered"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "No No hi! value registered value registered"+ "'", var6.equals("No No hi! value registered value registered"));

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test82");


    Exceptions.InterruptingException var1 = new Exceptions.InterruptingException("No No hi! value registered value registered");
    java.lang.String var2 = var1.toString();
    java.lang.Throwable[] var3 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation"+ "'", var2.equals("No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test83");


    lexer.UnexistingToken var1 = new lexer.UnexistingToken("hi!");
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "The token you entered (hi!) doesn't match any token of the grammar"+ "'", var2.equals("The token you entered (hi!) doesn't match any token of the grammar"));

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test84");


    token.Num var1 = new token.Num(0);
    java.lang.String var2 = var1.toString();
    stack.Stack.addElement((token.Value)var1);
    java.lang.String var4 = var1.toString();
    java.lang.Integer var5 = var1.getValue();
    parameters.Memory.remember((token.Value)var1);
    stack.Stack.addElement((token.Value)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "0"+ "'", var2.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "0"+ "'", var4.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0+ "'", var5.equals(0));

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test85");


    AST.CalculInt var0 = new AST.CalculInt();
    token.Num var2 = new token.Num((-1));
    java.lang.String var3 = var2.toString();
    stack.Stack.addElement((token.Value)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parse((token.Token)var2);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "-1"+ "'", var3.equals("-1"));

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test86");


    parameters.MemoryException var1 = new parameters.MemoryException("No hi! value registered");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    java.lang.String var3 = var1.toString();
    java.lang.String var4 = var1.toString();
    java.lang.Throwable[] var5 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "No No hi! value registered value registered"+ "'", var3.equals("No No hi! value registered value registered"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "No No hi! value registered value registered"+ "'", var4.equals("No No hi! value registered value registered"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test87");


    AST.BaseInt var0 = new AST.BaseInt();
    token.Num var2 = new token.Num(0);
    java.lang.String var3 = var2.toString();
    boolean var4 = parameters.ModeManager.rightType((token.Value)var2);
    boolean var5 = parameters.ModeManager.rightType((token.Value)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parse((token.Token)var2);
      fail("Expected exception of type java.lang.Error");
    } catch (java.lang.Error e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "0"+ "'", var3.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test88");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      token.Instruction var1 = token.Instruction.valueOf("100.0");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test89");


    token.Float var1 = new token.Float(100.0d);
    java.lang.Double var2 = var1.getValue();
    java.lang.String var3 = var1.toString();
    java.lang.Double var4 = var1.getValue();
    java.lang.String var5 = var1.toString();
    java.lang.String var6 = var1.toString();
    java.lang.Double var7 = var1.getValue();
    java.lang.Double var8 = var1.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 100.0d+ "'", var2.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "100.0"+ "'", var3.equals("100.0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 100.0d+ "'", var4.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "100.0"+ "'", var5.equals("100.0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "100.0"+ "'", var6.equals("100.0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 100.0d+ "'", var7.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 100.0d+ "'", var8.equals(100.0d));

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test90");


    token.Num var1 = new token.Num(0);
    java.lang.String var2 = var1.toString();
    stack.Stack.addElement((token.Value)var1);
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.toString();
    java.lang.Integer var6 = var1.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "0"+ "'", var2.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "0"+ "'", var4.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "0"+ "'", var5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 0+ "'", var6.equals(0));

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test91");


    token.Num var1 = new token.Num(1);
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "1"+ "'", var2.equals("1"));

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test92");


    token.Num var1 = new token.Num(0);
    java.lang.String var2 = var1.toString();
    stack.Stack.addElement((token.Value)var1);
    java.lang.Integer var4 = var1.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "0"+ "'", var2.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0+ "'", var4.equals(0));

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test93");


    AST.BaseInt var0 = new AST.BaseInt();
    token.Num var2 = new token.Num(0);
    boolean var3 = parameters.ModeManager.rightType((token.Value)var2);
    parameters.Memory.remember((token.Value)var2);
    parameters.Memory.remember((token.Value)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parse((token.Token)var2);
      fail("Expected exception of type java.lang.Error");
    } catch (java.lang.Error e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test94");


    token.Num var1 = new token.Num((-1));
    java.lang.String var2 = var1.toString();
    parameters.Memory.remember((token.Value)var1);
    stack.Stack.addElement((token.Value)var1);
    java.lang.String var5 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "-1"+ "'", var2.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "-1"+ "'", var5.equals("-1"));

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test95");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      token.Instruction var1 = token.Instruction.valueOf("1");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test96");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      token.Op var1 = token.Op.valueOf("No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test97");


    AST.DivisionZero var0 = new AST.DivisionZero();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "You cannot divide by zero"+ "'", var1.equals("You cannot divide by zero"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "You cannot divide by zero"+ "'", var2.equals("You cannot divide by zero"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "You cannot divide by zero"+ "'", var3.equals("You cannot divide by zero"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "You cannot divide by zero"+ "'", var4.equals("You cannot divide by zero"));

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test98");


    AST.DivisionZero var0 = new AST.DivisionZero();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    Exceptions.InterruptingException var4 = new Exceptions.InterruptingException("No No hi! value registered value registered");
    java.lang.String var5 = var4.toString();
    java.lang.String var6 = var4.toString();
    var0.addSuppressed((java.lang.Throwable)var4);
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    java.lang.String var10 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "You cannot divide by zero"+ "'", var1.equals("You cannot divide by zero"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "You cannot divide by zero"+ "'", var2.equals("You cannot divide by zero"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation"+ "'", var5.equals("No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation"+ "'", var6.equals("No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "You cannot divide by zero"+ "'", var8.equals("You cannot divide by zero"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "You cannot divide by zero"+ "'", var9.equals("You cannot divide by zero"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "You cannot divide by zero"+ "'", var10.equals("You cannot divide by zero"));

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test99");


    AST.CalculInt var0 = new AST.CalculInt();
    token.Num var2 = new token.Num(0);
    java.lang.Integer var3 = var2.getValue();
    java.lang.String var4 = var2.toString();
    boolean var5 = parameters.ModeManager.rightType((token.Value)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parse((token.Token)var2);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0+ "'", var3.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "0"+ "'", var4.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test100");


    token.Num var1 = new token.Num(0);
    java.lang.Integer var2 = var1.getValue();
    java.lang.String var3 = var1.toString();
    java.lang.Integer var4 = var1.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 0+ "'", var2.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "0"+ "'", var3.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0+ "'", var4.equals(0));

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test101");


    Exceptions.InterruptingException var1 = new Exceptions.InterruptingException("No No hi! value registered value registered");
    java.lang.String var2 = var1.toString();
    java.lang.String var3 = var1.toString();
    parameters.MemoryException var5 = new parameters.MemoryException("No hi! value registered");
    java.lang.Throwable[] var6 = var5.getSuppressed();
    var1.addSuppressed((java.lang.Throwable)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation"+ "'", var2.equals("No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation"+ "'", var3.equals("No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test102");


    token.Num var1 = new token.Num(0);
    java.lang.String var2 = var1.toString();
    parameters.Memory.remember((token.Value)var1);
    java.lang.String var4 = var1.toString();
    stack.Stack.addElement((token.Value)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "0"+ "'", var2.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "0"+ "'", var4.equals("0"));

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test103");


    lexer.UnexistingToken var1 = new lexer.UnexistingToken("No hi! value registered");
    java.lang.String var2 = var1.toString();
    java.lang.String var3 = var1.toString();
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.toString();
    java.lang.String var6 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "The token you entered (No hi! value registered) doesn't match any token of the grammar"+ "'", var2.equals("The token you entered (No hi! value registered) doesn't match any token of the grammar"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "The token you entered (No hi! value registered) doesn't match any token of the grammar"+ "'", var3.equals("The token you entered (No hi! value registered) doesn't match any token of the grammar"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "The token you entered (No hi! value registered) doesn't match any token of the grammar"+ "'", var4.equals("The token you entered (No hi! value registered) doesn't match any token of the grammar"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "The token you entered (No hi! value registered) doesn't match any token of the grammar"+ "'", var5.equals("The token you entered (No hi! value registered) doesn't match any token of the grammar"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "The token you entered (No hi! value registered) doesn't match any token of the grammar"+ "'", var6.equals("The token you entered (No hi! value registered) doesn't match any token of the grammar"));

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test104");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      token.Op var1 = token.Op.valueOf("The token you entered (No hi! value registered) doesn't match any token of the grammar");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test105");


    parameters.MemoryException var1 = new parameters.MemoryException("hi!");
    parameters.MemoryException var3 = new parameters.MemoryException("hi!");
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.String var5 = var1.toString();
    parameters.MemoryException var7 = new parameters.MemoryException("hi!");
    var1.addSuppressed((java.lang.Throwable)var7);
    java.lang.Throwable[] var9 = var7.getSuppressed();
    java.lang.Throwable[] var10 = var7.getSuppressed();
    java.lang.String var11 = var7.toString();
    java.lang.String var12 = var7.toString();
    java.lang.Throwable[] var13 = var7.getSuppressed();
    Exceptions.InterruptingException var15 = new Exceptions.InterruptingException("");
    var7.addSuppressed((java.lang.Throwable)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "No hi! value registered"+ "'", var5.equals("No hi! value registered"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "No hi! value registered"+ "'", var11.equals("No hi! value registered"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "No hi! value registered"+ "'", var12.equals("No hi! value registered"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test106");


    parameters.MemoryException var1 = new parameters.MemoryException("No value is recorded for The token you entered (No hi! value registered) doesn't match any token of the grammar mode \n Please start a new calculation");

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test107");


    parameters.MemoryException var1 = new parameters.MemoryException("No value is recorded for 0 mode \n Please start a new calculation");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test108");


    parameters.MemoryException var1 = new parameters.MemoryException("0");
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "No 0 value registered"+ "'", var2.equals("No 0 value registered"));

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test109");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      token.Op var1 = token.Op.valueOf("0");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test110");


    token.Float var1 = new token.Float(100.0d);
    java.lang.Double var2 = var1.getValue();
    java.lang.String var3 = var1.toString();
    boolean var4 = parameters.ModeManager.rightType((token.Value)var1);
    java.lang.Double var5 = var1.getValue();
    java.lang.String var6 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 100.0d+ "'", var2.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "100.0"+ "'", var3.equals("100.0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 100.0d+ "'", var5.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "100.0"+ "'", var6.equals("100.0"));

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test111");


    AST.DivisionZero var0 = new AST.DivisionZero();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    AST.DivisionZero var3 = new AST.DivisionZero();
    java.lang.String var4 = var3.toString();
    var0.addSuppressed((java.lang.Throwable)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "You cannot divide by zero"+ "'", var1.equals("You cannot divide by zero"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "You cannot divide by zero"+ "'", var2.equals("You cannot divide by zero"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "You cannot divide by zero"+ "'", var4.equals("You cannot divide by zero"));

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test112");


    AST.CalculInt var0 = new AST.CalculInt();
    token.Num var2 = new token.Num(0);
    java.lang.String var3 = var2.toString();
    boolean var4 = parameters.ModeManager.rightType((token.Value)var2);
    boolean var5 = parameters.ModeManager.rightType((token.Value)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parse((token.Token)var2);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "0"+ "'", var3.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test113");


    token.Float var1 = new token.Float(100.0d);
    java.lang.Double var2 = var1.getValue();
    java.lang.String var3 = var1.toString();
    java.lang.Double var4 = var1.getValue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      parameters.Memory.remember((token.Value)var1);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 100.0d+ "'", var2.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "100.0"+ "'", var3.equals("100.0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 100.0d+ "'", var4.equals(100.0d));

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test114");


    parameters.MemoryException var1 = new parameters.MemoryException("You cannot divide by zero");
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "No You cannot divide by zero value registered"+ "'", var2.equals("No You cannot divide by zero value registered"));

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test115");


    parameters.MemoryException var1 = new parameters.MemoryException("No hi! value registered");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    java.lang.String var3 = var1.toString();
    java.lang.String var4 = var1.toString();
    parameters.MemoryException var6 = new parameters.MemoryException("No hi! value registered");
    java.lang.String var7 = var6.toString();
    java.lang.Throwable[] var8 = var6.getSuppressed();
    var1.addSuppressed((java.lang.Throwable)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "No No hi! value registered value registered"+ "'", var3.equals("No No hi! value registered value registered"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "No No hi! value registered value registered"+ "'", var4.equals("No No hi! value registered value registered"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "No No hi! value registered value registered"+ "'", var7.equals("No No hi! value registered value registered"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test116");


    AST.BaseInt var0 = new AST.BaseInt();
    token.Num var2 = new token.Num(0);
    java.lang.Integer var3 = var2.getValue();
    java.lang.String var4 = var2.toString();
    stack.Stack.addElement((token.Value)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parse((token.Token)var2);
      fail("Expected exception of type java.lang.Error");
    } catch (java.lang.Error e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0+ "'", var3.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "0"+ "'", var4.equals("0"));

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test117");


    token.Float var1 = new token.Float(10.0d);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test118");


    token.Num var1 = new token.Num(0);
    boolean var2 = parameters.ModeManager.rightType((token.Value)var1);
    parameters.Memory.remember((token.Value)var1);
    java.lang.Integer var4 = var1.getValue();
    parameters.Memory.remember((token.Value)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0+ "'", var4.equals(0));

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test119");


    Exceptions.InterruptingException var1 = new Exceptions.InterruptingException("No 0 value registered");

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test120");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      token.Instruction var1 = token.Instruction.valueOf("The token you entered (hi!) doesn't match any token of the grammar");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test121");


    Exceptions.InterruptingException var1 = new Exceptions.InterruptingException("No No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation value registered");

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test122");


    AST.CalculInt var0 = new AST.CalculInt();
    token.Num var2 = new token.Num(0);
    java.lang.String var3 = var2.toString();
    parameters.Memory.remember((token.Value)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parse((token.Token)var2);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "0"+ "'", var3.equals("0"));

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test123");


    Exceptions.InterruptingException var1 = new Exceptions.InterruptingException("The token you entered (No hi! value registered) doesn't match any token of the grammar");
    Exceptions.InterruptingException var3 = new Exceptions.InterruptingException("hi!");
    var1.addSuppressed((java.lang.Throwable)var3);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test124");


    parameters.MemoryException var1 = new parameters.MemoryException("No No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation value registered");
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "No No No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation value registered value registered"+ "'", var2.equals("No No No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation value registered value registered"));

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test125");


    token.Float var1 = new token.Float(100.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      parameters.Memory.remember((token.Value)var1);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test126");


    token.Num var1 = new token.Num(0);
    java.lang.String var2 = var1.toString();
    java.lang.Integer var3 = var1.getValue();
    stack.Stack.addElement((token.Value)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "0"+ "'", var2.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0+ "'", var3.equals(0));

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test127");


    Exceptions.InterruptingException var1 = new Exceptions.InterruptingException("No No No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation value registered value registered");

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test128");


    AST.DivisionZero var0 = new AST.DivisionZero();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    Exceptions.InterruptingException var4 = new Exceptions.InterruptingException("No No hi! value registered value registered");
    java.lang.String var5 = var4.toString();
    java.lang.String var6 = var4.toString();
    var0.addSuppressed((java.lang.Throwable)var4);
    java.lang.Throwable[] var8 = var0.getSuppressed();
    java.lang.Throwable[] var9 = var0.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "You cannot divide by zero"+ "'", var1.equals("You cannot divide by zero"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "You cannot divide by zero"+ "'", var2.equals("You cannot divide by zero"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation"+ "'", var5.equals("No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation"+ "'", var6.equals("No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test129");


    token.Num var1 = new token.Num(10);
    parameters.Memory.remember((token.Value)var1);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test130");


    Exceptions.InterruptingException var1 = new Exceptions.InterruptingException("100.0");

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test131");


    boolean var1 = token.Instruction.isModeInstruction((java.lang.Object)'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test132");


    AST.BaseInt var0 = new AST.BaseInt();
    token.Float var2 = new token.Float(0.0d);
    java.lang.Double var3 = var2.getValue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parse((token.Token)var2);
      fail("Expected exception of type java.lang.Error");
    } catch (java.lang.Error e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0.0d+ "'", var3.equals(0.0d));

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test133");


    AST.BaseInt var0 = new AST.BaseInt();
    token.Num var2 = new token.Num(100);
    java.lang.Integer var3 = var2.getValue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parse((token.Token)var2);
      fail("Expected exception of type java.lang.Error");
    } catch (java.lang.Error e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 100+ "'", var3.equals(100));

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test134");


    AST.BaseInt var0 = new AST.BaseInt();
    token.Num var2 = new token.Num(0);
    java.lang.String var3 = var2.toString();
    parameters.Memory.remember((token.Value)var2);
    java.lang.String var5 = var2.toString();
    java.lang.Integer var6 = var2.getValue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parse((token.Token)var2);
      fail("Expected exception of type java.lang.Error");
    } catch (java.lang.Error e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "0"+ "'", var3.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "0"+ "'", var5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 0+ "'", var6.equals(0));

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test135");


    token.Float var1 = new token.Float(1.0d);
    java.lang.Double var2 = var1.getValue();
    java.lang.Double var3 = var1.getValue();
    boolean var4 = parameters.ModeManager.rightType((token.Value)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 1.0d+ "'", var2.equals(1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 1.0d+ "'", var3.equals(1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test136");


    token.Num var1 = new token.Num(0);
    stack.Stack.addElement((token.Value)var1);
    java.lang.String var3 = var1.toString();
    parameters.Memory.remember((token.Value)var1);
    java.lang.String var5 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "0"+ "'", var3.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "0"+ "'", var5.equals("0"));

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test137");


    token.Num var1 = new token.Num(0);
    java.lang.String var2 = var1.toString();
    boolean var3 = parameters.ModeManager.rightType((token.Value)var1);
    java.lang.String var4 = var1.toString();
    stack.Stack.addElement((token.Value)var1);
    boolean var6 = token.Instruction.isModeInstruction((java.lang.Object)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "0"+ "'", var2.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "0"+ "'", var4.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test138");


    token.Float var1 = new token.Float((-1.0d));

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test139");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      token.Op var1 = token.Op.valueOf("The token you entered (No value is recorded for hi! mode \n Please start a new calculation) doesn't match any token of the grammar");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test140");


    token.Num var1 = new token.Num(0);
    java.lang.String var2 = var1.toString();
    parameters.Memory.remember((token.Value)var1);
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "0"+ "'", var2.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "0"+ "'", var4.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "0"+ "'", var5.equals("0"));

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test141");


    AST.DivisionZero var0 = new AST.DivisionZero();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    Exceptions.InterruptingException var4 = new Exceptions.InterruptingException("No No hi! value registered value registered");
    java.lang.String var5 = var4.toString();
    java.lang.String var6 = var4.toString();
    var0.addSuppressed((java.lang.Throwable)var4);
    java.lang.String var8 = var4.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "You cannot divide by zero"+ "'", var1.equals("You cannot divide by zero"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "You cannot divide by zero"+ "'", var2.equals("You cannot divide by zero"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation"+ "'", var5.equals("No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation"+ "'", var6.equals("No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation"+ "'", var8.equals("No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation"));

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test142");


    AST.CalculInt var0 = new AST.CalculInt();
    token.Num var2 = new token.Num(0);
    boolean var3 = parameters.ModeManager.rightType((token.Value)var2);
    parameters.Memory.remember((token.Value)var2);
    java.lang.Integer var5 = var2.getValue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parse((token.Token)var2);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0+ "'", var5.equals(0));

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test143");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      token.Instruction var1 = token.Instruction.valueOf("No value is recorded for 0 mode \n Please start a new calculation");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test144");


    token.Num var1 = new token.Num(100);
    java.lang.Integer var2 = var1.getValue();
    boolean var3 = parameters.ModeManager.rightType((token.Value)var1);
    boolean var4 = parameters.ModeManager.rightType((token.Value)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 100+ "'", var2.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test145");


    parameters.MemoryException var1 = new parameters.MemoryException("hi!");
    parameters.MemoryException var3 = new parameters.MemoryException("hi!");
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.String var5 = var1.toString();
    parameters.MemoryException var7 = new parameters.MemoryException("hi!");
    var1.addSuppressed((java.lang.Throwable)var7);
    java.lang.Throwable[] var9 = var7.getSuppressed();
    java.lang.Throwable[] var10 = var7.getSuppressed();
    java.lang.String var11 = var7.toString();
    java.lang.String var12 = var7.toString();
    java.lang.Throwable[] var13 = var7.getSuppressed();
    java.lang.String var14 = var7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "No hi! value registered"+ "'", var5.equals("No hi! value registered"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "No hi! value registered"+ "'", var11.equals("No hi! value registered"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "No hi! value registered"+ "'", var12.equals("No hi! value registered"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "No hi! value registered"+ "'", var14.equals("No hi! value registered"));

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test146");


    AST.DivisionZero var0 = new AST.DivisionZero();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "You cannot divide by zero"+ "'", var1.equals("You cannot divide by zero"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "You cannot divide by zero"+ "'", var2.equals("You cannot divide by zero"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "You cannot divide by zero"+ "'", var3.equals("You cannot divide by zero"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "You cannot divide by zero"+ "'", var4.equals("You cannot divide by zero"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "You cannot divide by zero"+ "'", var5.equals("You cannot divide by zero"));

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test147");


    lexer.UnexistingToken var1 = new lexer.UnexistingToken("No hi! value registered");
    java.lang.String var2 = var1.toString();
    java.lang.String var3 = var1.toString();
    parameters.MemoryException var5 = new parameters.MemoryException("hi!");
    parameters.MemoryException var7 = new parameters.MemoryException("hi!");
    var5.addSuppressed((java.lang.Throwable)var7);
    java.lang.String var9 = var5.toString();
    parameters.MemoryException var11 = new parameters.MemoryException("hi!");
    var5.addSuppressed((java.lang.Throwable)var11);
    java.lang.Throwable[] var13 = var11.getSuppressed();
    var1.addSuppressed((java.lang.Throwable)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "The token you entered (No hi! value registered) doesn't match any token of the grammar"+ "'", var2.equals("The token you entered (No hi! value registered) doesn't match any token of the grammar"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "The token you entered (No hi! value registered) doesn't match any token of the grammar"+ "'", var3.equals("The token you entered (No hi! value registered) doesn't match any token of the grammar"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "No hi! value registered"+ "'", var9.equals("No hi! value registered"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test148");


    Exceptions.InterruptingException var1 = new Exceptions.InterruptingException("No value is recorded for 0 mode \n Please start a new calculation");
    java.lang.String var2 = var1.toString();
    parameters.MemoryException var4 = new parameters.MemoryException("No hi! value registered");
    java.lang.Throwable[] var5 = var4.getSuppressed();
    java.lang.String var6 = var4.toString();
    java.lang.String var7 = var4.toString();
    var1.addSuppressed((java.lang.Throwable)var4);
    java.lang.String var9 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "No value is recorded for No value is recorded for 0 mode \n Please start a new calculation mode \n Please start a new calculation"+ "'", var2.equals("No value is recorded for No value is recorded for 0 mode \n Please start a new calculation mode \n Please start a new calculation"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "No No hi! value registered value registered"+ "'", var6.equals("No No hi! value registered value registered"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "No No hi! value registered value registered"+ "'", var7.equals("No No hi! value registered value registered"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "No value is recorded for No value is recorded for 0 mode \n Please start a new calculation mode \n Please start a new calculation"+ "'", var9.equals("No value is recorded for No value is recorded for 0 mode \n Please start a new calculation mode \n Please start a new calculation"));

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test149");


    token.Num var1 = new token.Num((-1));
    java.lang.String var2 = var1.toString();
    boolean var3 = parameters.ModeManager.rightType((token.Value)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "-1"+ "'", var2.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test150");


    Exceptions.InterruptingException var1 = new Exceptions.InterruptingException("No No hi! value registered value registered");
    java.lang.String var2 = var1.toString();
    java.lang.String var3 = var1.toString();
    java.lang.String var4 = var1.toString();
    Exceptions.InterruptingException var6 = new Exceptions.InterruptingException("No No hi! value registered value registered");
    java.lang.String var7 = var6.toString();
    java.lang.String var8 = var6.toString();
    java.lang.String var9 = var6.toString();
    var1.addSuppressed((java.lang.Throwable)var6);
    java.lang.String var11 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation"+ "'", var2.equals("No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation"+ "'", var3.equals("No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation"+ "'", var4.equals("No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation"+ "'", var7.equals("No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation"+ "'", var8.equals("No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation"+ "'", var9.equals("No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation"+ "'", var11.equals("No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation"));

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test151");


    Exceptions.InterruptingException var1 = new Exceptions.InterruptingException("No You cannot divide by zero value registered");

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test152");


    Exceptions.InterruptingException var1 = new Exceptions.InterruptingException("1");

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test153");


    AST.DivisionZero var0 = new AST.DivisionZero();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    Exceptions.InterruptingException var4 = new Exceptions.InterruptingException("No No hi! value registered value registered");
    java.lang.String var5 = var4.toString();
    java.lang.String var6 = var4.toString();
    var0.addSuppressed((java.lang.Throwable)var4);
    java.lang.Throwable[] var8 = var0.getSuppressed();
    java.lang.String var9 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "You cannot divide by zero"+ "'", var1.equals("You cannot divide by zero"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "You cannot divide by zero"+ "'", var2.equals("You cannot divide by zero"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation"+ "'", var5.equals("No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation"+ "'", var6.equals("No value is recorded for No No hi! value registered value registered mode \n Please start a new calculation"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "You cannot divide by zero"+ "'", var9.equals("You cannot divide by zero"));

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test154");


    token.Num var1 = new token.Num(0);
    stack.Stack.addElement((token.Value)var1);
    stack.Stack.addElement((token.Value)var1);
    java.lang.String var4 = var1.toString();
    stack.Stack.addElement((token.Value)var1);
    java.lang.Integer var6 = var1.getValue();
    java.lang.String var7 = var1.toString();
    java.lang.String var8 = var1.toString();
    parameters.Memory.remember((token.Value)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "0"+ "'", var4.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 0+ "'", var6.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "0"+ "'", var7.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "0"+ "'", var8.equals("0"));

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test155");


    parameters.MemoryException var1 = new parameters.MemoryException("hi!");
    parameters.MemoryException var3 = new parameters.MemoryException("hi!");
    var1.addSuppressed((java.lang.Throwable)var3);
    boolean var5 = token.Instruction.isModeInstruction((java.lang.Object)var3);
    java.lang.String var6 = var3.toString();
    java.lang.String var7 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "No hi! value registered"+ "'", var6.equals("No hi! value registered"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "No hi! value registered"+ "'", var7.equals("No hi! value registered"));

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test156");


    token.Num var1 = new token.Num(0);
    java.lang.Integer var2 = var1.getValue();
    java.lang.String var3 = var1.toString();
    stack.Stack.addElement((token.Value)var1);
    boolean var5 = parameters.ModeManager.rightType((token.Value)var1);
    boolean var6 = parameters.ModeManager.rightType((token.Value)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 0+ "'", var2.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "0"+ "'", var3.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test157");


    lexer.UnexistingToken var1 = new lexer.UnexistingToken("The token you entered (No value is recorded for hi! mode \n Please start a new calculation) doesn't match any token of the grammar");

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test158");


    token.Num var1 = new token.Num(0);
    java.lang.String var2 = var1.toString();
    java.lang.Integer var3 = var1.getValue();
    java.lang.Integer var4 = var1.getValue();
    parameters.Memory.remember((token.Value)var1);
    stack.Stack.addElement((token.Value)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "0"+ "'", var2.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0+ "'", var3.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0+ "'", var4.equals(0));

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test159");


    lexer.UnexistingToken var1 = new lexer.UnexistingToken("No hi! value registered");
    java.lang.String var2 = var1.toString();
    java.lang.String var3 = var1.toString();
    java.lang.String var4 = var1.toString();
    lexer.UnexistingToken var6 = new lexer.UnexistingToken("hi!");
    var1.addSuppressed((java.lang.Throwable)var6);
    java.lang.String var8 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "The token you entered (No hi! value registered) doesn't match any token of the grammar"+ "'", var2.equals("The token you entered (No hi! value registered) doesn't match any token of the grammar"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "The token you entered (No hi! value registered) doesn't match any token of the grammar"+ "'", var3.equals("The token you entered (No hi! value registered) doesn't match any token of the grammar"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "The token you entered (No hi! value registered) doesn't match any token of the grammar"+ "'", var4.equals("The token you entered (No hi! value registered) doesn't match any token of the grammar"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "The token you entered (No hi! value registered) doesn't match any token of the grammar"+ "'", var8.equals("The token you entered (No hi! value registered) doesn't match any token of the grammar"));

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test160");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      token.Op var1 = token.Op.valueOf("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test161");


    lexer.UnexistingToken var1 = new lexer.UnexistingToken("No value is recorded for The token you entered (No hi! value registered) doesn't match any token of the grammar mode \n Please start a new calculation");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test162");


    lexer.UnexistingToken var1 = new lexer.UnexistingToken("No value is recorded for hi! mode \n Please start a new calculation");
    java.lang.String var2 = var1.toString();
    java.lang.String var3 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "The token you entered (No value is recorded for hi! mode \n Please start a new calculation) doesn't match any token of the grammar"+ "'", var2.equals("The token you entered (No value is recorded for hi! mode \n Please start a new calculation) doesn't match any token of the grammar"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "The token you entered (No value is recorded for hi! mode \n Please start a new calculation) doesn't match any token of the grammar"+ "'", var3.equals("The token you entered (No value is recorded for hi! mode \n Please start a new calculation) doesn't match any token of the grammar"));

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test163");


    token.Num var1 = new token.Num(100);
    java.lang.Integer var2 = var1.getValue();
    boolean var3 = parameters.ModeManager.rightType((token.Value)var1);
    java.lang.String var4 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 100+ "'", var2.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "100"+ "'", var4.equals("100"));

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test164");


    token.Num var1 = new token.Num(0);
    stack.Stack.addElement((token.Value)var1);
    stack.Stack.addElement((token.Value)var1);
    boolean var4 = parameters.ModeManager.rightType((token.Value)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

}
