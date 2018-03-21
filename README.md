# react-native-idfa

I have fixed main problem that IDFAPackage is not abstract and does not override abstract method createJSModules() in ReactPackage.
If you got a problem from original repository. You could use this.

Thank you.

## How to install

```
npm install https://github.com/rm3rdmodules/react-native-idfa.git --save
react-native link
```

Since this library is using the advertising identifier, you must remember to add
AdSupport in your IOS project.

Add AdSupport.framework under "Link Binary With Libraries".

## How to use!

```
import { IDFA } from '@rm3rdmodules/react-native-idfa';

class Basic extends Component {
  state = {
     IDFA: '',
  };

  componentDidMount() {
    IDFA.getIDFA().then((idfa) => {
      this.setState({ IDFA: idfa, });
    })
    .catch((e) => {
      console.error(e);
    });
  }

  render() {
    return (
      <View style={{ flex: 1 }}>
        <Text>Your IDFA is : {this.state.IDFA}</Text>
      </View>
    );
  }
}
```

## How to run example

```
git clone git@github.com:rm3rdmodules/react-native-idfa.git
cd react-native-idfa/examples/Basic
npm install
npm run start
```

Open simulators and see your IDFA
