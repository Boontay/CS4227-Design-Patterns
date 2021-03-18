package test.thirdQuestion;

//interface IRequired {
//    String clientMethod1(int x);
//    int clientMethod2(String x);
//}
//
//class Adaptee {
//    public String adapteeMethod1(int x);
//    public int adapteeMethod2(String x);
//}
//
//class Client {
//    public String someMethod(IRequired target);
//}
//
//class PluggabelAdapterDemo {
//    private final Adaptee adaptee;
//
//    public String useClientMethod(Client client) {
//        IRequired adapter = new IRequired() {
//            @Override
//            public String clientMethod1(int x) {
//                return adaptee.adapteeMethod1(x);
//            }
//
//            @Override
//            public int clientMethod2(String x) {
//                return adaptee.adapteeMethod2(x);
//            }
//        };
//
//        return client.someMethod(adapter);
//    }
//}
