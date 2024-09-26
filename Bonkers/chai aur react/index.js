let orderAccepted=false;
let isValetFound=false;
let hasRestaurantSeenYourOrder=false;
let restaurantTimer=null;

//Zomato App - BOot up/Power Up /Sart
window.addEventListener('load',function(){
    this.document.getElementById('acceptOrder').addEventListener('click',function(){
        askRestaurantTOAcceptOrReject();
    });
    checkIfOrderAcceptedFromRestaurant()
    .then(isOrderAccepted=>{
        console.log('updated from restaurant - ',isOrderAccepted);
        if(isOrderAccepted)this.alert('Your order has been accepted')
        else this.alert('Sorry restaurant could accept ')
    })
    .catch(err=>{
        console.error(err);
        alert('Something went wron! Please try again later')
    })
})
//Step 1 - Check whether restaurant accepted order or not
function askRestaurantToAcceptOrReject(){
    // callback
    setTimeout(() => {
        isOrderAccepted = confirm('Should restaurant accept order?');
        hasRestaurantSeenYourOrder = true;
    }, 1000);
    
}
//Step 2 - Check if Restaruant has accepted order
function checkIfOrderAcceptedFromRestaurant() {
    // Promise - resolve or reject 
    return new Promise((resolve, reject) => {
        restaurantTimer = setInterval(()=>{
            console.log('checking if order accepted or not');
            if (!hasRestaurantSeenYourOrder) return;

            if (isOrderAccepted) resolve(true);
            else resolve(false);

            clearInterval(restaurantTimer);
        },2000);
    });
}
