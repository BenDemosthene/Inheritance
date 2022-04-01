public class circles extends shapes {
       
    int radius;
    int diameter;

        public circles(){
            super();

            radius = 0;
            diameter = 0;
            shapeName =  "circle";    
        }

        public circles(String name, double radius, double diameter){
            this.shapeName = "yourcirclename";
            this.radius = 1;
            this.diameter = 1;
        }

        public String typeOfCircle(){
            return "round";
        }

        
        public String typeOfCircle(String x){
            return "x";
        }

        @Override
        public int area(int area){
            return 2;
        }


    }
    
