    import java.util.Locale;

    public class author{
        private String name;
        private String email;
        private char gender;

        public author (String name, String email, char gender){
            this.name = name.toUpperCase(Locale.ROOT);
            this.email = email.toUpperCase(Locale.ROOT);
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public char getGender() {
            return gender;
        }

        public void setGender(char gender) {
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "author{" +
                    "name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

