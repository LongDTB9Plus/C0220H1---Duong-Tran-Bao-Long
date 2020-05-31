package Collection.BaiTap;
import org.apache.commons.collections4.iterators.IteratorEnumeration;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Prefix {
    static boolean isOperand(String x)
    {
        switch (x){
            case "+":
            case "-":
            case "*":
                return false;
            default:
                return true;
        }
    }

    static String getInfix(Stack exp)
    {
        Stack<String> s = new Stack<String>();
        int StackSize = exp.size();
        for (int i = 0; i < StackSize; i++)
        {
            String now = (String) exp.pop();
            if (isOperand(now))
            {
                s.push(now + "");
            }

            else
            {
                String op1 = s.peek();
                s.pop();
                String op2 = s.peek();
                s.pop();
                s.push("(" + op2 + now +
                        op1 + ")");
            }
        }
        return s.peek();
    }

    public static void main(String args[]) throws ScriptException {
        Stack<String> exp = new Stack<>();
        exp.push("+");
        exp.push("*");
        exp.push("2");
        exp.push("2");
        exp.push("-");
        exp.push("5");
        exp.push("*");
        exp.push("+");
        exp.push("4");
        exp.push("3");
        exp.push("2");
        String result = (getInfix(exp));
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        System.out.println(result);
        System.out.println(engine.eval(result));
    }
}