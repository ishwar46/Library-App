using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using Xamarin.Forms;
using Xamarin.Forms.Xaml;

namespace Kaiser
{
    [XamlCompilation(XamlCompilationOptions.Compile)]
    public partial class Login : ContentPage
    {
        public Login()
        {
            InitializeComponent();
        }

        private void Button_Clicked(object sender, EventArgs e)
        {
            if(txtUsername.Text=="admin" && txtPassword.Text == "1234")
            {
                Navigation.PushAsync(new Dashboard(txtUsername.Text));              
            }

            else
            {
                DisplayAlert("Alert!", "Username or Password is incorrect!", "OK");
            }
        }

        private void TapGestureRecognizer_Tapped(object sender, EventArgs e)
        {
            Navigation.PushAsync(new Register());
        }
    }
}