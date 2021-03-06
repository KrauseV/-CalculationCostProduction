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
public class Logic {

    ShowData showData;
  ReadLine readLine;
       Calculation calculation;
   Check check;
   ArrayMachineData arrayMachineData;
    Parse parse;

    public Logic(ShowData showData,
                 ReadLine readLine,
                 Calculation calculation,
                 Check check,
                 ArrayMachineData arrayMachineData,
                 Parse parse) {
        this.showData = showData;
       this.readLine = readLine;
        this.calculation = calculation;
this.check =check;
this.arrayMachineData = arrayMachineData;
this.parse = parse;
    }



    public void Active(){
       showData.AvailableMachines(arrayMachineData);
while (true){
    System.out.println("Введите установки");
    if(check.isCorrectMachines(arrayMachineData,readLine.setMachines())){
        while (true){
            System.out.println("Введите мощность");
            if(check.CorrectPower(parse.getUnits(readLine.machines,arrayMachineData),readLine.setPower())) {
               calculation.setSignature(parse.getUnits(readLine.machines,arrayMachineData),
                       readLine.power);
                     showData.ShowResult(calculation.compute());
                break;
            }
        }
        break;
    }

}
    }
}
