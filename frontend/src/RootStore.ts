import LoginStore from "./login/LoginStore";

class RootStore {
    public loginStore: LoginStore;

    constructor() {
        this.loginStore = new LoginStore();
    }
}

const rootStore = new RootStore();
export default rootStore;