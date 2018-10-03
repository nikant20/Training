import { PipeTransform, Pipe } from "../../node_modules/@angular/core";

export class Employee{
    constructor(private id:number, private name:string, private salary:number,private  gender:string, private dob:Date){
    } //Shortcut intialization of properties
    
}

//Creating Custom pipe
@Pipe({
    name:'formatName',
})
export class NameFormatter implements PipeTransform{
    transform(formatValue:string, formatInput:string){
        if (formatInput=='Male') {
            return "Mr. "+formatValue;
        }else{
            return "Miss. "+formatValue;
        }
    }
}

@Pipe({
    name:'genderFormat'
})
export class DetailFormatter implements PipeTransform{
    transform(formatValue:string, formatInput:string){
            if(formatInput=='Male'){
                return "M";
            }else{
                return "F";
            }
    }
}
