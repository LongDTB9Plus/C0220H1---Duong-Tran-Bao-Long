import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';

import {YoutubePlaylistComponent} from './youtube-playlist/youtube-playlist.component';
import {YoutubePlayerComponent} from './youtube-player/youtube-player.component';
import {RouterModule} from '@angular/router';


@NgModule({
  declarations: [YoutubePlaylistComponent, YoutubePlayerComponent],
  imports: [
    CommonModule,
    RouterModule
  ]
})
export class YoutubeModule {
}
