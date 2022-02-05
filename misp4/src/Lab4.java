// var. 134940
public class Lab4 {
    public static void main(String[] args) {
        E a = new E();
        E b = new A();
        A c = new A();
        b.f23();
        c.f21();
        c.f42();
        a.f27();
        b.f18();
        a.f25();
        b.f35();
        c.f7();
        b.f41();
        c.f19();
        b.f36(a);
        c.f36(b);
        c.f36(c);
        c.f44();
        c.f39();
        c.f33();
        Thread t = new Thread(new Runnable() {
            public void run() {
                while(true) {
                    try {
                        A d = new A();
                        d.f48();
                        Thread.sleep(8);
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
}
class E {
    int f4;
    int f12;
    int f2;
    int f40;
    int f32;
    long f14;
    long f13;
    long f10;
    java.io.ObjectOutputStream stringsOutput;
    java.io.ObjectOutputStream printStream;
    int[] f11 = {-2, 1, -3, -2};
    int[] f20 = {2, 2, 2, 1};
    int[] f17 = {0, 3, -1, 0};
    static java.util.Map<java.net.URI,byte[]> cache = new java.util.HashMap<>();
    static int f1;
    static int f38;
    static int f31;
    static int f24;
    static int f47;
    java.util.List<String> f9 = new java.util.ArrayList<>();
    java.util.List<String> f50 = new java.util.ArrayList<>();
    java.util.List<String> f5 = new java.util.ArrayList<>();
    public E() {
        f4 = 8;
        f12 = 1;
        f2 = 0;
        f40 = 0;
        f32 = 1;
        f14 = 1L;
        f13 = 1L;
        f10 = 5L;
        try {
            stringsOutput = new java.io.ObjectOutputStream(new java.io.FileOutputStream("stringsOutput.txt"));
            printStream = new java.io.ObjectOutputStream(new java.io.FileOutputStream("printStream.txt"));
        } catch (java.lang.Exception e) {
            // Do nothing
        }
    }
    public void init() {
        try {
            if (stringsOutput == null) stringsOutput = new java.io.ObjectOutputStream(new java.io.FileOutputStream("stringsOutput.txt"));
            System.out.println("Thread : " + Thread.currentThread() + ", stringsOutput = " + stringsOutput);
        } catch(Exception e) {
            // Ignore it
        }
        try {
            if (printStream == null) printStream = new java.io.ObjectOutputStream(new java.io.FileOutputStream("printStream.txt"));
            System.out.println("Thread : " + Thread.currentThread() + ", printStream = " + printStream);
        } catch(Exception e) {
            // Ignore it
        }
    }
    public byte[] getValueFromCache(String s) {
        try {
            java.net.URI url = new java.net.URI(s);
            if(!cache.containsKey(url)) {
                cache.put(url, new byte[1310720]);
            }
            return cache.get(url);
        } catch (Exception e) {
            System.out.println("Error: invalid URL!");
            return null;
        }
    }
    public void f23() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(stringsOutput) {
                            stringsOutput.writeObject("метод f23 в классе E (#" + String.valueOf(i) + ")");
                            Thread.sleep(5);
                            stringsOutput.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void f21() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(stringsOutput) {
                            stringsOutput.writeObject("метод f21 в классе E (#" + String.valueOf(i) + ")");
                            Thread.sleep(6);
                            stringsOutput.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void f42() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(stringsOutput) {
                            stringsOutput.writeObject("метод f42 в классе E (#" + String.valueOf(i) + ")");
                            Thread.sleep(6);
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void f27() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(stringsOutput) {
                            stringsOutput.writeObject("метод f27 в классе E (#" + String.valueOf(i) + ")");
                            Thread.sleep(6);
                            stringsOutput.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void f18() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(stringsOutput) {
                            stringsOutput.writeObject("метод f18 в классе E (#" + String.valueOf(i) + ")");
                            Thread.sleep(5);
                            stringsOutput.flush();
                            stringsOutput.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void f25() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(stringsOutput) {
                            stringsOutput.writeObject("метод f25 в классе E (#" + String.valueOf(i) + ")");
                            Thread.sleep(6);
                            stringsOutput.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public static void f35() {
        System.out.println("метод f35 в классе E");
        System.out.println(f1);
    }
    public static void f7() {
        System.out.println("метод f7 в классе E");
        System.out.println((f1 - 2));
    }
    public static void f41() {
        System.out.println("метод f41 в классе E");
        System.out.println(f38);
    }
    public static void f19() {
        System.out.println("метод f19 в классе E");
        System.out.println((f38 + 4));
    }
    public void f36(E r) {
        r.f23();
    }
    public void f36(A r) {
        r.f21();
    }
}
class A extends E {
    public A() {
        f12 = 2;
        f2 = 1;
        f32 = 8;
    }
    public void f23() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(stringsOutput) {
                            stringsOutput.writeObject("метод f23 в классе A (#" + String.valueOf(i) + ")");
                            Thread.sleep(7);
                            stringsOutput.flush();
                            stringsOutput.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void f42() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(stringsOutput) {
                            stringsOutput.writeObject("метод f42 в классе A (#" + String.valueOf(i) + ")");
                            Thread.sleep(12);
                            stringsOutput.flush();
                            stringsOutput.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void f18() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(printStream) {
                            printStream.writeObject("метод f18 в классе A (#" + String.valueOf(i) + ")");
                            Thread.sleep(11);
                            printStream.flush();
                            printStream.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void f44() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                while(true) {
                    try {
                        synchronized(cache) {
                            getValueFromCache("https://www.google.com");
                            Thread.sleep(8);
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void f39() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                while(true) {
                    try {
                        synchronized(cache) {
                            getValueFromCache("https://www.google.com");
                            Thread.sleep(14);
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void f33() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                while(true) {
                    try {
                        synchronized(cache) {
                            getValueFromCache("https://www.google.com");
                            Thread.sleep(12);
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public static void f35() {
        System.out.println("метод f35 в классе A");
        System.out.println(f1++);
    }
    public static void f7() {
        System.out.println("метод f7 в классе A");
        System.out.println(f38);
    }
    public static void f41() {
        System.out.println("метод f41 в классе A");
        System.out.println((f38 - 5));
    }
    public static void f19() {
        System.out.println("метод f19 в классе A");
        System.out.println(f38);
    }
    public void f49() {
        for(int i = 0; i < 8; i++) {
            this.f5.add(String.valueOf(System.nanoTime()));
            // System.out.println(this.f5.size());
        }
    }
    public void f48() {
        for(int i = 0; i < 5; i++) {
            this.f50.add(String.valueOf(System.nanoTime()));
            // System.out.println(this.f50.size());
        }
    }
    public void f16() {
        for(int i = 0; i < 9; i++) {
            this.f50.add(String.valueOf(System.nanoTime()));
            // System.out.println(this.f50.size());
        }
    }
    public void f22() {
        for(int i = 0; i < 8; i++) {
            this.f5.add(String.valueOf(System.nanoTime()));
            // System.out.println(this.f5.size());
        }
    }
    public void f36(E r) {
        r.f42();
    }
    public void f36(A r) {
        r.f27();
    }
}
