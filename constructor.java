    class Sample {
        String name;
        Sample(String name){
            this.name="Hello"+name;
        }
    }
    class Main{
    public static void main(String[]args){
        Sample greeting=new Sample("jam");
        System.out.println(greeting.name);
    }
    }
