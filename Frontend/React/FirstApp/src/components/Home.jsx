import Company from "./Company";
import Profile from "./profile";

function Home({isLoggedIn=false}) {
    let content;

    if(!isLoggedIn){
        content = <Company />
    }
    else {
        content = <Profile />
    }

    return (
        <>
            <div>
                {content}
            </div>
        </>
    )
}
export default Home