import { makeAutoObservable } from "mobx";

class LoginStore {
    public username: string = "";
    public password: string = "";

    constructor() {
        makeAutoObservable(this);
    }

    public onUsernameChange = (e: any) => {
        this.username = e.target.value
    }
  
    public onPasswordChange = (e: any) => {
        this.password = e.target.value;
    }

    public onSignin = () => {
        console.log(`In Signin user: ${this.username} pw: ${this.password}`);
    }
}

export default LoginStore;