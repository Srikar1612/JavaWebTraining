import logo from '/images/image.png'

function Profile(){
    const user = {
        name: `Srikar`,
        imageUrl: logo,
        imageSize: 400
    };

    return (
        <>
            <h1>{user.name}</h1>
            <img
             src={user.imageUrl} 
             alt={`photo of ${user.name}`}
             style={{
                width: user.imageSize,
                height: user.imageSize
             }}
             />
        </>
    )
}

export default Profile