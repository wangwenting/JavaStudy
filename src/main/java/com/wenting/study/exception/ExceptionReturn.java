package com.wenting.study.exception;

/**
 * @Author: hzwangwenting-01
 * @Description:
 * @Date: 2017/8/19 下午5:02
 */
public class ExceptionReturn {

    /**
     * 函数必须throws Exception 编译器强制
     * @throws Exception
     */
    public void TestException() throws Exception{
        throw new Exception();
    }

    /**
     * RuntimeException 运行时异常， 编译器不强制, 不用throws Exception
     */
    public void TestRuntimeException() {
        throw  new RuntimeException();
    }

    /**
     * 异常没有打印
     */
    public static void TestNotPrint() {
        try {
            throw new RuntimeException("Test");
        } finally {
            return;
        }
     }


    /**
     * 异常A没有捕捉
     */
    public static void ExceptionDispose() {
        try {

            try {
                throw new RuntimeException("AAAAA");
            } finally {
                throw new RuntimeException("BBBB");
            }
        } catch (RuntimeException e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        TestNotPrint();
        ExceptionDispose();
    }
}
