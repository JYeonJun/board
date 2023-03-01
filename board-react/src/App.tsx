import logo from "./logo.svg";
import "./App.css";
import SignUp from "./views/SignUp";

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
      </header>
      <SignUp />
    </div>
  );
}

export default App;
