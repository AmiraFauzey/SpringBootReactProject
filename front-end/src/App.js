import logo from './logo.svg';
import './App.css';

function App() {
  console.log("hello");
  const reqBody = {
    username : "mira",
    password : "abc123",
  };
  fetch("api/auth/login",{
    headers : {
      "Content-Type": "application/json",
      "Accept": "application/json"
    },
    method : "post",
    body : JSON.stringify(reqBody),
  })
  .then((Response) => Promise.all([Response.json(),Response.headers]))
  .then(([body, headers]) =>
    {
      const authValue = headers.get("authorization");
      console.log(authValue);
      console.log(body);
    });
    // headers.forEach((element) => {
    //   console.log(element);
    // })
  return (
    <div className="App">
    <h1>Hello world</h1>
    </div>
  );
}

export default App;
