import { NgModule } from '@angular/core';
import {Routes, RouterModule, PreloadAllModules} from '@angular/router';
import {YoutubePlaylistComponent} from './youtube/youtube-playlist/youtube-playlist.component';
import {YoutubePlayerComponent} from './youtube/youtube-player/youtube-player.component';
import {LifeTimeComponent} from './lifeTimeCalculator/life-time/life-time.component';
import {SearchComponent} from './dictionary/search/search.component';

const routes: Routes = [
  {
    path: 'youtube',
    component: YoutubePlaylistComponent,
    children: [{
      path: ':id',
      component: YoutubePlayerComponent
    }]
  },
  {
    path: 'timelines',
    component: LifeTimeComponent

  },
  {
    path: 'dictionary',
    component: SearchComponent

  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes, {
    preloadingStrategy: PreloadAllModules
  })],
  exports: [RouterModule]
})
export class AppRoutingModule {}
