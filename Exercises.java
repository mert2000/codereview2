public class Exercises {
        private String exerciseName;
        private String description;
        private int duration;
        private String position;

        public Exercises(String exerciseName,String description,int duration,String position)
        {
            this.exerciseName=exerciseName;
            this.description=description;
            this.duration=duration;
            this.position=position;
        }

        public String getExerciseName() {
            return exerciseName;
        }

        public void setExerciseName(String exerciseName) {
            this.exerciseName = exerciseName;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        @Override
        public String toString() {
            return "EXERCISE NAME:"+getExerciseName()+"\t\t"+"DURATION:"+getDuration()+"\n"+"------------------------------"+"\n"+getDescription()+"\n\n";
        }

    }

