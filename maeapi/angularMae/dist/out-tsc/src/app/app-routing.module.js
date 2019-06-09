import * as tslib_1 from "tslib";
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { ListarComponent } from './Mae/listar/listar.component';
import { AddComponent } from './Mae/add/add.component';
import { EditComponent } from './Mae/edit/edit.component';
const routes = [
    { path: 'listar', component: ListarComponent },
    { path: 'add', component: AddComponent },
    { path: 'edit', component: EditComponent }
];
let AppRoutingModule = class AppRoutingModule {
};
AppRoutingModule = tslib_1.__decorate([
    NgModule({
        imports: [RouterModule.forRoot(routes)],
        exports: [RouterModule]
    })
], AppRoutingModule);
export { AppRoutingModule };
//# sourceMappingURL=app-routing.module.js.map