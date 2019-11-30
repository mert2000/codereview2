public class IntervalWorkOut {
        private String exercName;
        private String exerciName;
        private String exercisName;
        private int round;
        private int repetition;
        private int breakTime;

        public String getExercName() {
            return exercName;
        }

        public void setExercName(String exercName) {
            this.exercName = exercName;
        }

        public String getExerciName() {
            return exerciName;
        }

        public void setExerciName(String exerciName) {
            this.exerciName = exerciName;
        }

        public String getExercisName() {
            return exercisName;
        }

        public void setExercisName(String exercisName) {
            this.exercisName = exercisName;
        }

        public int getRepetition() {
            return repetition;
        }

        public void setRepetition(int repetition) {
            this.repetition = repetition;
        }

        public int getBreakTime() {
            return breakTime;
        }

        public void setBreakTime(int breakTime) {
            this.breakTime = breakTime;
        }

        public int getRound() {
            return round;
        }

        public void setRound(int round) {
            this.round = round;
        }

            public IntervalWorkOut(String exerciseName, String exerciName, String exercisName, int repetition, int breakTime, int round) {
            this.exercName = exerciseName;
            this.exerciName=exerciName;
            this.exercisName=exercisName;
            this.repetition = repetition;
            this.breakTime = breakTime;
            this.round=round;
        }

        @Override
        public String toString() {
            return  "============================================"+"\n"
                    +"ROUND:"+" "+getRound()+"\n"
                    +getExercName()+"\n"
                    +getExerciName()+"\n"
                    +getExercisName()+"\n"
                    +"============================================"+"\n"
                    +"DO A BREAK FOR (30 SECONDS)";
        }
    }

