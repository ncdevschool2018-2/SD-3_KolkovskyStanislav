import {Group} from "./group";

export class Student{

  choosen:boolean = false;
  // private adding_in_group:boolean = true;
  // private removing_from_group:boolean = false;
  idstudent:number;
  fname: string;
  lname:string;
  email:string;
  password: string;
  group:Group;

  constructor(){}


  static cloneStudent(student: Student):Student{
    let copyStudent = new Student();
    copyStudent.idstudent = student.idstudent;
    copyStudent.fname = student.fname;
    copyStudent.lname =  student.lname;
    copyStudent.email =   student.email;
    copyStudent.password =  student.password;
    copyStudent.group = student.group;
    return copyStudent;
  }
}
