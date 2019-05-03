package com.wenting.study.dynamic;

/**
 * @Author wangwenting
 * @Date 2017/6/23 下午10:40
 */
public class Test {

    // UserService has a impl
    public static void TestUserService() {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        UserService userService = new UserServiceImpl();
        DynamicUserHandler dynamicUserHandler = new DynamicUserHandler();
        userService = (UserService) dynamicUserHandler.bind(classLoader, UserService.class, userService);
        userService.sayGoodbye();
        userService.sayHello();
    }

    // GroupService No impl
    public static void TestGroupService() {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        DynamicGroupHandler dynamicGroupHandler = new DynamicGroupHandler();
        GroupService groupService = (GroupService) dynamicGroupHandler.bind(classLoader, GroupService.class);
        groupService.getGroup();
    }

    public static void main(String []args){
        System.out.println("Test User Service");
        TestUserService();
        System.out.println("Test Group Service");
        TestGroupService();
    }
}
