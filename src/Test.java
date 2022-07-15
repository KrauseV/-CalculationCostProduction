/*
 *  Copyright [2022] [KrauseV]
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

public class Test {



    public static void main(String[] args) {

while (true) {
    Start();
}
}


    private static void Start() {
        Logik logik = new Logik(new ShowData(),
                new ReadLine(),
                new Calculation(),
                new Chek(),
                new MachineData(),
                new Parse());
        logik.Activ();
      /*  ReadLine readLine;//Считывание данных от пользователя
        MachineData machin;// Считывание таблицы соотношения мощности\стоимости.
        Parse parse = new Parse(new ReadLine());
        if(parse.CorrectPower()) {// If all correct
            Calculation calculation = new Calculation(parse.units,parse.task.power);//Рассчет
           // calculation.Calc();
        calculation.asString();
        }

       // Print();//Вывод результата*/
    }


}
