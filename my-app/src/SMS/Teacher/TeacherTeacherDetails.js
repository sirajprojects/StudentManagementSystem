import React from "react";
import { Outlet, Link } from "react-router-dom";

function TeacherTeacherDetails() {
  return (
    <body>
      {/* <!-- Preloader Start Here --> */}
      <div id="preloader"></div>
      {/* <!-- Preloader End Here --> */}
      <div id="wrapper" className="wrapper bg-ash">
        {/* <!-- Header Menu Area Start Here --> */}
        <div className="navbar navbar-expand-md header-menu-one bg-light">
          <div className="navbar-head">
            <div className="header-logo"></div>
            <div className="toggle-button sidebar-toggle"></div>
          </div>
          <div className="d-md-none mobile-nav-bar">
            <button
              className="navbar-toggler pulse-animation"
              type="button"
              data-toggle="collapse"
              data-target="mobile-navbar"
              aria-expanded="false"
            >
              <i className="far fa-arrow-alt-circle-down"></i>
            </button>
            <button
              type="button"
              className="navbar-toggler sidebar-toggle-mobile"
            >
              <i className="fas fa-bars"></i>
            </button>
          </div>
          <div
            className="header-main-menu collapse navbar-collapse"
            id="mobile-navbar"
          >
            <ul className="navbar-nav"></ul>
            <ul className="navbar-nav"></ul>
          </div>
        </div>
        {/* <!-- Header Menu Area End Here -->
        <!-- Page Area Start Here --> */}
        <div className="dashboard-page-one">
          {/* <!-- Sidebar Area Start Here --> */}
          <div className="sidebar-main sidebar-menu-one sidebar-expand-md sidebar-color">
            <div className="mobile-sidebar-header d-md-none">
              <div className="header-logo">
                <Link to="">
                  <img src="img/logo1.png" alt="logo" />
                </Link>
              </div>
            </div>
            <div className="sidebar-menu-content">
              <ul className="nav nav-sidebar-menu sidebar-toggle-view">
                <li className="nav-item sidebar-nav-item">
                  <Link to="" className="nav-link">
                    <i className="flaticon-classmates"></i>
                    <span>Students</span>
                  </Link>
                  <ul className="nav sub-group-menu sub-group-active">
                    <li className="nav-item">
                      <Link to="/teacher-all-student" className="nav-link">
                        <i className=""></i>All Students
                      </Link>
                    </li>

                  
                  </ul>
                </li>
                <li className="nav-item sidebar-nav-item">
                  <Link to="" className="nav-link">
                    <i className="flaticon-multiple-users-silhouette"></i>
                    <span>Teachers</span>
                  </Link>
                  <ul className="nav sub-group-menu sub-group-active">
                    <li className="nav-item">
                      <Link to="/teacher-teacher-details" className="nav-link">
                        <i className=""></i>Teachers Details
                      </Link>
                    </li>

                    
                  </ul>
                </li>

                

             

                <li className="nav-item">
                  <Link to="/teacher-class-routine" className="nav-link">
                    <i className="flaticon-calendar"></i>
                    <span>Class Routine</span>
                  </Link>
                </li>
                <li className="nav-item">
                  <Link to="/teacher-student-attendance" className="nav-link">
                    <i className="flaticon-checklist"></i>
                    <span>Attendence</span>
                  </Link>
                </li>

                
              </ul>
            </div>
          </div>
          {/* <!-- Sidebar Area End Here --> */}
          <div className="dashboard-content-one">
            {/* <!-- Breadcubs Area Start Here --> */}
            <div className="breadcrumbs-area">
              <h3>Teacher</h3>
              <ul></ul>
            </div>
            {/* <!-- Breadcubs Area End Here -->
                <!-- Student Table Area Start Here --> */}
            <div className="card height-auto">
              <div className="card-body">
                <div className="heading-layout1">
                  <div className="item-title">
                    <h3>About Me</h3>
                  </div>
                </div>
                <div className="single-info-details">
                  <div className="item-img"></div>
                  <div className="item-content">
                    <div className="header-inline item-header">
                      <h3 className="text-dark-medium font-medium"></h3>
                    </div>

                    <div className="info-table table-responsive">
                      <table className="table text-nowrap">
                        <tbody>
                          <tr>
                            <td>Name:</td>
                            <td className="font-medium text-dark-medium"></td>
                          </tr>
                          <tr>
                            <td>Gender:</td>
                            <td className="font-medium text-dark-medium"></td>
                          </tr>
                          <tr>
                            <td>Father Name:</td>
                            <td className="font-medium text-dark-medium"></td>
                          </tr>
                          <tr>
                            <td>Mother Name:</td>
                            <td className="font-medium text-dark-medium"></td>
                          </tr>
                          <tr>
                            <td>Religion:</td>
                            <td className="font-medium text-dark-medium"></td>
                          </tr>
                          <tr>
                            <td>Joining Date:</td>
                            <td className="font-medium text-dark-medium"></td>
                          </tr>
                          <tr>
                            <td>E-mail:</td>
                            <td className="font-medium text-dark-medium"></td>
                          </tr>
                          <tr>
                            <td>Subject:</td>
                            <td className="font-medium text-dark-medium"></td>
                          </tr>
                          <tr>
                            <td>Class:</td>
                            <td className="font-medium text-dark-medium"></td>
                          </tr>
                          <tr>
                            <td>Section:</td>
                            <td className="font-medium text-dark-medium"></td>
                          </tr>
                          <tr>
                            <td>ID No:</td>
                            <td className="font-medium text-dark-medium"></td>
                          </tr>
                          <tr>
                            <td>Address:</td>
                            <td className="font-medium text-dark-medium"></td>
                          </tr>
                          <tr>
                            <td>Phone:</td>
                            <td className="font-medium text-dark-medium"></td>
                          </tr>
                        </tbody>
                      </table>
                    </div>
                  </div>
                </div>
              </div>
            </div>

            <footer className="footer-wrap-layout1"></footer>
          </div>
        </div>
      </div>
    </body>
  );
}

export default TeacherTeacherDetails;
