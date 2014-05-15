module Api
  class SongsController < ApplicationController
    def index
      render :json => Song.all
    end
    def show

    end
  end
end
