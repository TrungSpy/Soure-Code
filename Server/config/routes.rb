Rails.application.routes.draw do
  mount RailsAdmin::Engine => '/admin', as: 'rails_admin'

  namespace :api do
    resources :playlists
    resources :songs
  end


  root :to => "home#index"
  devise_for :users
end
